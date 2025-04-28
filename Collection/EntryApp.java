package Collection;

import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {
        Map<String, String> map = new java.util.HashMap<>();

        map.put("Eko", "Eko Value");
        map.put("Budi", "Budi Value");
        map.put("Joko", "Joko Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
