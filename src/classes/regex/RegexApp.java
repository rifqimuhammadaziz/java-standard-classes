package classes.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Rifqi Muhammad Aziz";

        /**
         * Search with pattern
         * First letter : a-z | A-Z
         * Between words have 'a' letter
         * Last letter : a-z | A-Z
         */
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }
    }
}
