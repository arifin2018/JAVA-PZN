public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);
        System.out.println(a % b);

        int c = 600;
        for (int i = 0; i < 5; i++) {
            System.out.println(++c);
            // System.out.println(c++);
        }
    }
}
