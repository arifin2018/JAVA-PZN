package arifin;

import java.util.Arrays;
import java.util.List;

public class Calculator {
    public Integer divide(Integer first,Integer second){
        if (first == 0 || second == 0) {
            throw new IllegalArgumentException("Can't devide by zero");
        }else{
            return first/second;
        }
    }

    public Integer add(Integer first, Integer second){
        return first + second;
    }

    public static void main(String[] args) {
        List<String> nama = Arrays.asList("Andi", "Budi", "Cici");
        nama.stream()
            .filter(s -> s.startsWith("B"))
            .forEach(System.out::println);
    }
}
