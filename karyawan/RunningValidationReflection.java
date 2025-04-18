package karyawan;

import karyawan.Utill.ValidationUtil;
import karyawan.arifin.LoginRequest;

public class RunningValidationReflection {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("arifin");
        ValidationUtil.validationReflection(loginRequest);
    }
}
