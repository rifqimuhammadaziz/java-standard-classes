package classes.system;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // current time in millisecond
        System.out.println(System.nanoTime()); // current time in nanosecond

        System.out.println(System.getenv("APP"));

        System.exit(0);
        System.out.println("Not executed because apps is exit");
    }
}
