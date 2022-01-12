package classes.string;

public class StringBuilderApp {
    public static void main(String[] args) {
        /**
         * StringBuilder
         * instead of creating a lot of string variables,
         * better to use StringBuilder for save memory.
         * Create one object String Builder to add multiple strings
         */
        StringBuilder builder = new StringBuilder();
        builder.append("Rifqi");
        builder.append(" ");
        builder.append("Muhammad");
        builder.append(" ");
        builder.append("Aziz");

        String name = builder.toString();
        System.out.println(name);
    }
}
