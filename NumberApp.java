public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        System.out.println(longValue);
        System.out.println(doubleValue);


        String stringNumber = "100.00";
        try {
            int contohInt = Integer.valueOf(stringNumber);
            System.out.println(contohInt);
        } catch (NumberFormatException e) {
            System.out.println("Error => " + e.getMessage());
        }
    }
}
