import java.util.StringJoiner;

public class StringJoinerClass {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("|");
        joiner.add("nur");
        joiner.add("arifin");

        System.out.println(joiner);
    }
}
