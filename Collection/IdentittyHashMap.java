package Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentittyHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new IdentityHashMap<>(); // map size nya akan jadi 2 karena di beda memory
        // Map<String,String> map = new HashMap<>(); //map size nya akan jadi 1 karena di memory yang sama
        String key1 = "name.first";
        
        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "arifin");
        map.put(key2, "arifin");

        System.out.println(map.size());

    }
}
