package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // Set<String> names = new HashSet<>(); //perbedannya adalah data ini tidak urut seperti di golang
        Set<String> names = new LinkedHashSet<>(); //ini datanya urut
        names.add("nur");
        names.add("arifin");
        names.add("khoirunnisaMJ");
        names.add("azriel");
        names.add("azriel");

        // System.out.println(Arrays.toString(names.toArray()));
        for (String string : names) {
            System.out.println(string);
        }
        System.out.println(names);
    }
}
