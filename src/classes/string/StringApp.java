package classes.string;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String name = "Rifqi Muhammad Aziz";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Rifqi"));
        System.out.println(name.endsWith("Aziz"));

        // Split with space
        String[] splitNames = name.split(" ");
        for (var splitName : splitNames) {
            System.out.println(splitName);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(0));

        // get character by character on string
        char[] chars = name.toCharArray();
    }
}
