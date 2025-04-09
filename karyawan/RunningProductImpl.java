package karyawan;

import karyawan.arifin.Product;

public class RunningProductImpl {
    public static void main(String[] args) {
        RunningProduct rp = new Product();
        System.out.println(rp.RunningMainProduct());

        RunningProduct rpk = new karyawan.kukuh.Product();
        System.out.println(rpk.RunningMainProduct());
    }
}
