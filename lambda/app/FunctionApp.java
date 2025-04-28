package lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        Function<String, Object> functionLength = value -> value.length();

        System.out.println(functionLength.apply("Eko"));

    }
}
