package generic.application;

import java.util.Arrays;

import generic.Person;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("arifin","indonesia"),
            new Person("azriel","indonesia"),
            new Person("mj","indonesia"),
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

    }
}
