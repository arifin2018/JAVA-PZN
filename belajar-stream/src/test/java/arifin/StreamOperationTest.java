package arifin;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class StreamOperationTest {
    
    @Test
    void testStreamOpearation(){
        List<String> names = List.of("Nur","Arifin","Azriel");
        Stream<String> streamNamesUpperCase = names.stream().map(String::toUpperCase);
        streamNamesUpperCase.forEach(System.out::println);
    }
}
