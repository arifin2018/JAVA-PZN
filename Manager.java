class Manager extends Employee {
    String name;
    String address;

    Manager(String name){
        super(name);
        this.name = name;
    }

    Manager(String name,String address){
        super(name);
        this.name = name;
        this.address = address;
    }

    void sayHello(String name){
        System.out.println("Hi " + name + ", My Name Is MANAGER " + this.name);
    }
}
