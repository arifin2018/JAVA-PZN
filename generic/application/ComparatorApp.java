package generic.application;

import java.util.Arrays;
import java.util.Comparator;

import generic.Person;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] person = {
            new Person("arifin","indonesia"),
            new Person("azriel","indonesia"),
            new Person("mj","indonesia"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(person,comparator);
        System.out.println(Arrays.toString(person));
    }
}
