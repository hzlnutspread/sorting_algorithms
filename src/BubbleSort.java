import java.util.Random;

public class BubbleSort {

    public void run(int size) {

        Random rand = new Random();
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }

        System.out.println("Before: ");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nAfter: ");
        printArray(numbers);

    }

    private void bubbleSort(int[] array) {

        boolean swappedSomething = true;

        while (swappedSomething) {

            swappedSomething = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swappedSomething = true;
                    int temp = array[i];    // if you dont have this line, then array[i] is lost as now both are set to array[i+1]
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

    }

    private void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}