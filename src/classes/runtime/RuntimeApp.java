package classes.runtime;

public class RuntimeApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available Processor: " + runtime.availableProcessors());
        System.out.println("Free memory JVM: " + runtime.freeMemory());
        System.out.println("Total memory of JVM: " + runtime.totalMemory());
        System.out.println("Max memory: " + runtime.maxMemory());
    }
}
