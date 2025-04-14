package karyawan.Utill;

public class MathUtil {
    public static int sum(int... values){
        int total = 0;
        for (int i : values) {
            total += i;
        }
        return total;
    }
}
