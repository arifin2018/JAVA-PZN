package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("arifin");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("11");
        mutable.add("22");
        List<String> immutable = Collections.unmodifiableList(mutable);
        List<String> element = List.of("nur","arifin");

    }
}
