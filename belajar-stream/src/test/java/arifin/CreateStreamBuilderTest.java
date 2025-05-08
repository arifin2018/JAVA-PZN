package arifin;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder(){
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("arifin");
        builder.add("azriel").add("rafiq");


        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
            .add("Eko").add("Kurniawan").add("Khannedy").build();

        stream.forEach(System.out::println);
    }
}
