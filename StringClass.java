import java.util.Arrays;

public class StringClass {
    public static void main(String[] args) {
        String name = "Nur Arifin";
        System.out.println(name);

        String[] names = name.split(" "); 
        System.out.println(Arrays.toString(names));
    }
}
