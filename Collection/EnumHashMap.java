package Collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMap {
    public static enum Level{
        FREE,STANDARD,PREMIUM,VIP
    }

    public static void main(String[] args) {
        Map<Level,String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Nur");
        map.put(Level.STANDARD, "Arifin");

        for (EnumHashMap.Level string : map.keySet()) {
            System.out.println(map.get(string));
        }
    }

}
