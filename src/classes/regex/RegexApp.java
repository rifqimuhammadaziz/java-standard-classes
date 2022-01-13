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

        Pattern pattern1 = Pattern.compile("rifqi", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher(name);
        boolean matchFound = matcher1.find();
        if (matchFound) {
            System.out.println("Kata yang dicari ditemukan");
        } else {
            System.out.println("Kata yang dicari tidak ditemukan!!!");
        }
    }
}
