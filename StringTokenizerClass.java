import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        String value = "Nur Arifin";
        StringTokenizer token = new StringTokenizer(value," ");
        
        while (token.hasMoreTokens()) {
            String result = token.nextToken();
            System.out.println(result);
        }
    }
}
