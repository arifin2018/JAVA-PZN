package generic.application;

import generic.MyData;

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("arifin");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> mydata){
        System.out.println(mydata.getData());
    }
}
