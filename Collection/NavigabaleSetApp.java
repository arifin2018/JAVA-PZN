package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigabaleSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("nur","arifin","1","2","3")); //TreeSet in Java automatically sorts its elements in ascending order
        NavigableSet<String> namesReverse = names.descendingSet(); //trying to descending order
        System.out.println(namesReverse);
        NavigableSet<String> arifin = names.headSet("arifin", true); //get first data untill arifin,incslusive is included data element "arifin"
        System.out.println(arifin);
        NavigableSet<String> arifin2 = names.tailSet("arifin", true); //the first data is arifin untill last data names
        System.out.println(arifin2);
        for (String string : names) {
            System.out.println(string);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names); //make a disable to edit data
        immutable.add("sss"); //will be fail cause data has been immutable
    }
}
