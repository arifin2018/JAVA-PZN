package arifin.Services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import arifin.data.Person;
import arifin.repositories.UserRepository;
import arifin.services.UserServices;

@Extensions({
    @ExtendWith(MockitoExtension.class)
})
class PersonServiceTest {
    @Mock
    
    private UserRepository userRepository;
    private UserServices userService;

    @BeforeEach
        void setUp() {
        userService = new UserServices(userRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            userService.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        // menambah behavior ke mock object
        Mockito.when(userRepository.selectByID("eko"))
            .thenReturn(new Person("eko", "Eko"));

        var person = userService.get("eko");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("eko", person.getId());
        Assertions.assertEquals("Eko", person.getName());
    }

    @Test
    void testRegisterSuccess() {
        var person = userService.register("Eko");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Eko", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(userRepository, Mockito.times(1))
            .insert(new Person(person.getId(), "Eko"));
    }
}   
