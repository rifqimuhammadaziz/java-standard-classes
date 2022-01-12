package classes.scanner;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Name: ");
        String name = scanner.nextLine(); // input as string

        System.out.print("Input Age: ");
        Integer age = scanner.nextInt(); // input as integer

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
    }
}
