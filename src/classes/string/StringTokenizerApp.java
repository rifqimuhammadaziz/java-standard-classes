package classes.string;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        /**
         * StringTokenizer
         * Separate/Split the string with delimiter.
         * More save memory than use Split Class
         */
        String name = "Rifqi Muhammad Aziz";
        StringTokenizer tokenizer = new StringTokenizer(name, " "); // separate with space based on string

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }
    }
}
