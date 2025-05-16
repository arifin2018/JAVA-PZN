package arifin;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class NumberFormatTest {
    @Test
    void testNumberFormat(){
        var indonesia = new Locale("id","ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        var number = numberFormat.format(12345.6789);
        System.out.println(number);
    }

    @Test
    void testNumberFormatparseIndonesia(){
        var indonesia = new Locale("id","ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        
        double result;
        try {
            result = numberFormat.parse("1.000.000,221").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
