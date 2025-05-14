package arifin.utill;

import java.util.Scanner;

public class inputData {
    public static Scanner sc = new Scanner(System.in);

    public static String inputDataScanner(String info){
        System.out.print(info + " => ");
        String data = sc.nextLine();
        return data;
    }
}
