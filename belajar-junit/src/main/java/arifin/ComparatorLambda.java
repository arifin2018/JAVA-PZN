package arifin;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) { 
        String[] names = {"Budi", "Andi", "Citra"};  
        // Menggunakan anonymous class 
        Arrays.sort(names, new Comparator<String>() { 
            @Override 
            public int compare(String s1, String s2) { 
                return s1.compareTo(s2); 
            } }); 
            System.out.println("Sorted with anonymous class: " + Arrays.toString(names));  
            // Menggunakan lambda expression 
            Arrays.sort(names, (s1, s2) -> s1.compareTo(s2)); 
            System.out.println("Sorted with lambda: " + Arrays.toString(names)); 
        }
}
