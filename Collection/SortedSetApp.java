package Collection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import Collection.data.Person;
import Collection.data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        people.add(new Person("nur"));//masih bisa menambah karna mutable
        people.add(new Person("arifin"));
        people.add(new Person("azriel"));

        for (Person person : people) {
            System.out.println(person.getName());
        }


        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        sortedSet.add(new Person("tukul")); //tidak bisa dirubah kembali karena sudah di immutable

    }
}
