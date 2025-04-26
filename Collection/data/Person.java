package Collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;
    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
        // return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies.add(hobbies);
    }


}
