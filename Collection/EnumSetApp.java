package Collection;

import java.util.EnumSet;

public class EnumSetApp {
    public static enum Gender{
        MALE, FEMALE
    }
    public static void main(String[] args) {
        EnumSet<Gender> enumSet = EnumSet.allOf(Gender.class);
        System.out.println();
        for (Gender gender : enumSet) {
            System.out.println(gender);
        }
    }
}
