package arifin;

import java.util.concurrent.Callable;

public class LambdaExample {
    public static void main(String[] args) { 
        // Menggunakan anonymous class 
        Runnable r1 = new Runnable() { 
            @Override 
            public void run() { 
                System.out.println("Hello from anonymous class"); 
            } }; 
        r1.run();  // Menggunakan lambda expression 
        Runnable r2 = () -> System.out.println("Hello from lambda"); r2.run(); 
    }
}
