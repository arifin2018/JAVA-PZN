package arifin;

import java.util.List;

import org.junit.jupiter.api.Test;

class ForEachOperationTest {
    @Test
    void testPeekBefore() {
        List.of("Eko", "Kurniawan", "Khannedy").stream()
            .map(name -> {
            System.out.println("Before Change Name to Upper : " + name);
            String upper = name.toUpperCase();
            System.out.println("Change Name to Upper : " + upper);
            return upper;
            })
            .forEach(name -> System.out.println("Final Name : " + name));
    }

    @Test
    void testPeekAfter() {
        List.of("Eko", "Kurniawan", "Khannedy").stream()
            .peek(name -> System.out.println("Before Change Name to Upper : " + name))
            .map(name -> name.toUpperCase())
            .peek(upper -> System.out.println("Change Name to Upper : " + upper))
            .forEach(name -> System.out.println("Final Name : " + name));
    }
}
