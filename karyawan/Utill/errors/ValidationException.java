package karyawan.Utill.errors;

public class ValidationException extends Throwable {
    public ValidationException(String message){
        super(message);
    }
}
