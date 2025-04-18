package karyawan.Utill;

import java.lang.reflect.Field;

import karyawan.Utill.errors.BlankException;
import karyawan.Utill.errors.ValidationException;
import karyawan.annotation.NotBlank;
import karyawan.arifin.LoginRequest;

public class ValidationUtil {
    public static void validate(Object loginRequest) throws ValidationException{
        if (loginRequest instanceof LoginRequest) {
            LoginRequest loginRequest2 = (LoginRequest) loginRequest;
            if (loginRequest2.getUsername() == null) {
                throw new ValidationException("Username is null");
            }else if (loginRequest2.getUsername().isBlank()) {
                throw new ValidationException("Username is blank");
            }else if (loginRequest2.getPassword() == null) {
                throw new NullPointerException("Password is null");
            } else if (loginRequest2.getPassword().isBlank()) {
                throw new ValidationException("Password is blank");
            }
        }
    }

    public static void validateRuntime(Object loginRequest){
        if (loginRequest instanceof LoginRequest) {
            LoginRequest loginRequest2 = (LoginRequest) loginRequest;
            if (loginRequest2.getUsername() == null) {
                throw new BlankException("Username is null");
            }else if (loginRequest2.getUsername().isBlank()) {
                throw new BlankException("Username is blank");
            }else if (loginRequest2.getPassword() == null) {
                throw new NullPointerException("Password is null");
            } else if (loginRequest2.getPassword().isBlank()) {
                throw new BlankException("Password is blank");
            }
        }
    }

     public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    // String value = (String) field.get(object);
                    Object value = (Object) field.get(object);
                    System.out.println(field);
                    System.out.println(value);
                    if (value ==  null) {
                        throw new BlankException("Field tidak boleh kosong " + field.getName());
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("gagal mendapatkan field " + e.getMessage());
                }
            }
        }
    }
}
