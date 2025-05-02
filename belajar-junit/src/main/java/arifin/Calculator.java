package arifin;

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
}
