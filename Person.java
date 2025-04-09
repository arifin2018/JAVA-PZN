public class Person {
    String Name;
    String Address;
    final String Country = "Indonesia";

    Person(String paramName, String paramAddress){
        Name = paramName;
        Address = paramAddress;
    }

    Person(String paramName){
        this(paramName, null);
    }

    Person(){
        this(null);
    }

    void sayHello(){
        this.sayHello("Bos");
    }

    void sayHello(String Name){
        System.out.println("Hello " + Name + ", My name is "+ this.Name);
    }
}
