package classes.string;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        /**
         * String Joiner
         * to output Array with templates
         */
        StringJoiner joiner = new StringJoiner(
                ", ",
                "[",
                "]"
        );

        joiner.add("Rifqi");
        joiner.add("Muhammad");
        joiner.add("Aziz");

        String mergeString = joiner.toString();
        System.out.println(mergeString);
    }
}
