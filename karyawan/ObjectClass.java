package karyawan;

public class ObjectClass {
    public static void main(String[] args) {
        printValue(10.20);
        printValue(1000);
        // printValue(null);
        printValue("Hello, World!");
    }

    static void printValue(Object value) {
        if (value != null) {
            System.out.println(value.getClass().getName());
        }else{
            System.out.println(value);
        }
    }
}
