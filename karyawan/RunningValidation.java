package karyawan;

import karyawan.Utill.ValidationUtil;
import karyawan.Utill.errors.BlankException;
import karyawan.Utill.errors.ValidationException;
import karyawan.arifin.LoginRequest;

public class RunningValidation {
    public static void main(String[] args) {
        LoginRequest loginReq = new LoginRequest();
        loginReq.setUsername(null);
        loginReq.setPassword("arifin");

        try {
            ValidationUtil.validate(loginReq);
            System.out.println("Data valid");
        } catch (ValidationException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        }finally{
            System.out.println("stecu stecu");
        }

        LoginRequest loginReq2 = new LoginRequest();
        loginReq2.setUsername(null);
        loginReq2.setPassword("arifin");

        try {
            ValidationUtil.validateRuntime(loginReq2);
            System.out.println("Data valid loginReq2");
        } catch (BlankException e) {
            System.out.println("Data tidak valid loginReq2 : " + e.getMessage());
        }finally{
            System.out.println("stecu stecu loginReq2");
        }
    }
}
