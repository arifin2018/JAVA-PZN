package generic.application;

import generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objecData = new MyData<>("arifin");
        process(objecData,"tukai");
    }

    public static void process(MyData<? super String>mydata, String a){
        mydata.setData("nur arifin");
        System.out.println(a);
    }
}
