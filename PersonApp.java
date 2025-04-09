public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("arifin","Jagakarsa");

        System.out.println(person1.Name);
        System.out.println(person1.Address);
        System.out.println(person1.Country);

        person1.sayHello("azriel");



        Person person2 = new Person("arifin2");
        System.out.println(person2);
        
        
        Person person3;
        person3 = new Person();
        person3.sayHello("eko");
        System.out.println(person3);
    }
}
