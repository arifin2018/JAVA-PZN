import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
            1,2,12,5,6,3,4,5,6,333,2,2424,335,464,756,6,4324,113,45,6
        };

        Arrays.sort(numbers);

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 333));
        
    }
}
