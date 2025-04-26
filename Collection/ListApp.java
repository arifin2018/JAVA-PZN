package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("nur");
        strings.add("arifin");
        strings.add("azriel");
        strings.add("rafiq");
        strings.add("pradipta");

        strings.set(0,"khoirunnisaMJ");

        System.out.println(strings.get(0));
        System.out.println();
        strings.remove(0);

        System.out.println(strings.toString());
        // for (String string : strings) {
        // }

    }
}
