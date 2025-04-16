package karyawan.Utill;

import karyawan.Utill.errors.BlankException;
import karyawan.Utill.errors.ValidationException;
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
}
