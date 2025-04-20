import java.util.UUID;

public class UuidApp {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            UUID uid = UUID.randomUUID();
            String key = uid.toString();

            System.out.println(key);
        }
    }
}
