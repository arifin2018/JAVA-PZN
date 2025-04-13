package karyawan;

import karyawan.arifin.Product;

public class Equals {
    public static void main(String[] args) {
        // String first = "Nur";
        // first = first + " " + "Arifin";

        // System.out.println(first);

        // String second = "Nur Arifin";
        // System.out.println(second);
        // System.out.println(first == second);
        // System.out.println(first = second);
        // System.out.println(first.equals(second));

        Product product = new Product();
        product.setName("motor");
        Product product2 = new Product();
        product2.setName("motor");

        System.out.println(product.hashCode() == product2.hashCode());
    }
}
