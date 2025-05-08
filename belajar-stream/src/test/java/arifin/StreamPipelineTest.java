package arifin;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class StreamPipelineTest {
    @Test
    void testCreateStreamPipeline() {
        // JARANG DIGUNAKAN CARA SEPERTI INI
        List<String> list = List.of("Eko", "Kurniawan", "Khannedy");

        Stream<String> stream = list.stream();

        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());

        Stream<String> streamMr = streamUpper.map(upper -> "Mr." + upper);

        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOk() {
        List<String> list = List.of("Eko", "Kurniawan", "Khannedy");

        list.stream()
            .map(name -> name.toUpperCase())
            .map(upper -> "Mr." + upper)
            .forEach(System.out::println);
    }
}
