package arifin;

import org.junit.jupiter.api.Test;
import java.util.Locale;

public class LocaleTest {
    
    @Test
    void testFirst()    {
        System.out.println("Hello World!");
    }

    @Test
    void testNewLocale(){
        var Locale = new Locale("id","ID");
        
        System.out.println(Locale.getLanguage());
        System.out.println(Locale.getCountry());

        System.out.println(Locale.getDisplayLanguage());
        System.out.println(Locale.getDisplayCountry());
    }
}
