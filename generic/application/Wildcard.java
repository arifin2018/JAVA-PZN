package generic.application;

import generic.MyData;

public class Wildcard {
    public static void main(String[] args) {
        print(new MyData<String>("suneo"));
        print(new MyData<Integer>(1));
        print(new MyData<>(1));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
