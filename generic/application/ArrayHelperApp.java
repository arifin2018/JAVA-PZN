package generic.application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"eko","Kurniawan","Khaneddy"};
        Integer[] numbers = {1,2,34,45};
        
        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.<Integer>count(numbers));
    }
}
