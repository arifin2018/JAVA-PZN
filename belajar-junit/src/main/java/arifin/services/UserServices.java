package arifin.services;

import java.util.UUID;

import arifin.data.Person;
import arifin.repositories.UserRepository;

public class UserServices {
    private UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Person get(String id){
        Person person = userRepository.selectByID(id);
        if (person != null) {
            return person;
        }else{
            throw new IllegalArgumentException("User not found");
        }
    }

    public Person register(String name){
        var person = new Person(UUID.randomUUID().toString(), name);
        userRepository.insert(person);
        return person;
    }

}
