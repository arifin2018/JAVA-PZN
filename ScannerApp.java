import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("NAMA => ");
        String name = scanner.nextLine();
        System.out.print("UMUR => ");
        Integer age = scanner.nextInt();


        System.out.printf("NAMA = %s\n", name);
        System.out.printf("UMUR = %d\n", age);
        scanner.close();
    }
}
