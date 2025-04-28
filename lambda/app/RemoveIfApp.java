package lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Eko", "Kurniawan", "Khannedy"));

        names.removeIf(new Predicate<String>() {
            public boolean test(String t){
                return t.length() > 5;
            }
        });

        names.removeIf(name -> name.length() > 5);
        
        System.out.println(names);
    }
}
