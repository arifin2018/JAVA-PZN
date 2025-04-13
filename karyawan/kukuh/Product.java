package karyawan.kukuh;

import karyawan.RunningProduct;

public class Product extends Location implements RunningProduct {

    protected String name;
    protected int price;

    public Product(String nameParams){
        this.name = nameParams;
    }

    public String RunningMainProduct(){
        return "kukuh";
    }

    public String LocationProduct(String nameParam){
        super.name = nameParam;
        return super.name;
    }

    public String toString(){
        return "this is Product " + name + " is pricing = "+price;
    }
}