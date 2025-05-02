package arifin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

@DisplayName("testing calculator class")
class CalculatorTest extends AbstractCalculatorTest {
    private final Calculator calculator = new Calculator();

    @DisplayName("testing function add in calculator class")
    @Test
    void additionSuccess(){
        assertEquals(2, calculator.add(1,1));
    }

    @DisplayName("testing function divide in calculator class")
    @Test
    void divideSuccess(){
        assertEquals(1, calculator.divide(1,1));
    }

    @DisplayName("testing function error divide in calculator class")
    @Test
    void divideThrowError(){
        assertThrows(IllegalArgumentException.class, () -> {calculator.divide(0,0);});
    }

    @BeforeEach
    void setUp(){
        System.out.println("=============Before Each====================");
    }

    @AfterEach
    void tearDown(){
        System.out.println("============After Each======================");
    }

    @Test
    void testAborted(){
        System.out.println("profile");
        var profile = System.getenv("PROFILE");
        System.out.println(profile);
        if (!"DEV".equals(profile)) {
            throw new TestAbortedException("TEST GAGAL KARNA BUKAN ENV DEV");
        }

        //logic testing jika env dev
    }

    @Test
    @Disabled
    void testDivideSoon(){

    }
}
