package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("arifin");
        collection.add("azriel");
        collection.add("talitha");
        collection.add("khoirunnisaMJ");
        collection.addAll(List.of("udin","khairul","ayah","ibu"));
        collection.addAll(Arrays.asList("tukul","doyok","tukul2","doyok2"));


        for (String name : collection) {
            System.out.println(name);
        }
        System.out.println("========================================REMOVE========================================");
        collection.remove("arifin");
        collection.removeAll(List.of("azriel","talitha"));
        for (String name : collection) {
            System.out.println(name);
        }

        System.out.println("========================================COLLECTION========================================");
        System.out.println(collection.contains("arifin"));
        System.out.println(collection.contains("khoirunnisaMJ"));
        System.out.println(collection.containsAll(List.of("udin","khairul")));

        System.out.println("========================================SIZE========================================");
        System.out.println(collection.size());
    }

}
