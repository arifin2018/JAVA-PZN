package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String,String> empty = Collections.emptyMap();
        Map<String,String> singleton = Collections.singletonMap("name","Eko");
        
        Map<String,String> mutable = new HashMap<>();
        mutable.put("name","Nur");
        System.out.println(mutable);
        System.out.println("=================================");
        System.out.println(empty);
        System.out.println("=================================");
        System.out.println(singleton);
        System.out.println("=================================");
        Map<String,String> immutable = Collections.unmodifiableMap(mutable);
        mutable.put("arifin","sss");

    }
}
