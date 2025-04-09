public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "samuel";
        System.out.println(child.name);
        child.doIt();
    }
}
