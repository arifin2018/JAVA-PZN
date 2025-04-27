package Collection;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,String> map = new java.util.HashMap<>();
        map.put("name.first","Nur");
        map.put("name.middle","Arifin");
        map.put("name.last","Azriel");

        System.out.println(map);
        System.out.println(map.get("name.first"));

        System.out.println(map.size());
    }
}
