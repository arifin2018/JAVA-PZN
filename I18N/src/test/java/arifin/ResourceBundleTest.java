package arifin;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.jupiter.api.Test;

public class ResourceBundleTest {

    @Test
    void testResourceBundle()    {
        var resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleIndonesia()    {
        var indonesia = new Locale("id","ID");
        var resourceBundle = ResourceBundle.getBundle("message",indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleNotFound()    {
        var indonesia = new Locale("en","US");
        var resourceBundle = ResourceBundle.getBundle("message",indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }
}
