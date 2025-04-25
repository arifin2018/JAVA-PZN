package generic.application;

import generic.MyData;

public class GenericApp {
    public static void main(String[] args) {
        MyData<String> myDataString = new MyData<String>("arifin");
        MyData<Integer> myDataInteger = new MyData<Integer>(100);

        String stringValue = myDataString.getData();
        Integer integerValue = myDataInteger.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
