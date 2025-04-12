package karyawan.kukuh;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("cucumber");
        System.out.println(product.name);
        System.out.println(product.price);

        var locProduct = product.LocationProduct("cucuh super");
        System.out.println(locProduct);
    }
}
