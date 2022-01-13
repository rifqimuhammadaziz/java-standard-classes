package classes.random;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(5000); // generate random number from 1-5000 for 1000 number
            System.out.println(value);
        }
    }
}
