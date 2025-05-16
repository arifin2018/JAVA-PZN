package arifin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class DateFormatTest {
    @Test
    void testDateFormat(){
        var pattern = "EEEE dd MMMM yyyy";
        var dateformat = new SimpleDateFormat(pattern);
        
        var format = dateformat.format(new Date());

        System.out.println(format);
    }

    @Test
    void testDateFormatIndonesia(){
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("id","ID");
        var dateformat = new SimpleDateFormat(pattern,indonesia);
        
        var format = dateformat.format(new Date());

        System.out.println(format);
    }
    

    @Test
    void testDateFormatJapan(){
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("ja","JP");
        var dateformat = new SimpleDateFormat(pattern,indonesia);
        
        var format = dateformat.format(new Date());

        System.out.println(format);
    }

    @Test
    void testDateParseFormatIndonesia(){
        var pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("id","ID");
        var dateformat = new SimpleDateFormat(pattern,indonesia);
        
        try {
            var date = dateformat.parse("Sabtu 17 Mei 2025");
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }
}
