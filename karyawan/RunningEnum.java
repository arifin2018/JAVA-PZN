package karyawan;

import karyawan.Utill.Level;
import karyawan.kukuh.Customer;

public class RunningEnum {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("arifin");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
    }
}
