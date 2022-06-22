import java.util.Random;

public class InsertionSort {

    public void run(int size) {

        Random rand = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter: ");
        printArray(numbers);

    }

    private void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }

    }

    private void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            //this works because you've decremented j so now j+1 will be the position at position of j previously
            inputArray[j + 1] = currentValue;
        }

    }
}