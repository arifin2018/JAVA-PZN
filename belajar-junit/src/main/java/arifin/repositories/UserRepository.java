package arifin.repositories;

import arifin.data.Person;

public interface UserRepository {
    Person selectByID(String id);
    void insert(Person person);
}
