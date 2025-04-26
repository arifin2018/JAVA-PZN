package Collection;

import java.util.List;

import Collection.data.Person;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("arifin");
        person.setHobbies("Game");
        person.setHobbies("Movie");

        doSomethingWithHobbies(person.getHobbies());

        for (String string : person.getHobbies()) {
            System.out.println(string);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("testing hobby");
    }
}
