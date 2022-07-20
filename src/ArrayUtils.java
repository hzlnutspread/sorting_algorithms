import java.util.Random;

public abstract class ArrayUtils {

    public static int[] generate(int size) {
        // initialise the array of 10 numbers
        Random rand = new Random();
        int[] numbers = new int[size];

        // generate the random array of 10 integers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        return numbers;
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}



