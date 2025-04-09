public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("awd");
        employee.sayHello("arifin");

        employee = new Manager("samuel");
        employee.sayHello("etoo");

        employee = new VicePresident();
        employee.sayHello("president");


        sayHello(new Employee("bayu"));
        sayHello(new Manager("ariifn"));
        sayHello(new VicePresident());
    }


    static void sayHello(Employee employee){
        if (employee instanceof VicePresident) {
            VicePresident vp = (VicePresident) employee;
            System.out.println("VicePresident => " +vp.name);
        }else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Manager => " + manager.name);
        }else{
            System.out.println("Employee => "+employee.name);
        }
    }

    static void sayHello2(Employee employee){
        System.out.println(employee.name);
    }
}
