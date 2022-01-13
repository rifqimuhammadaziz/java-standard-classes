package classes.arrays;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                2, 1, 54, 3, 4, 22, 10, 6, 111, 112, 130
        };

        // sorting array
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // searching data in sorted array
        System.out.println(Arrays.binarySearch(numbers, 10));
        System.out.println(Arrays.binarySearch(numbers, 6));

        // copy array
        int[] result = Arrays.copyOf(numbers, 5); // copy 5 array to new var
        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(numbers, 5, 7); // copy array from index 5 - 7
        System.out.println(Arrays.toString(result2));
    }
}
