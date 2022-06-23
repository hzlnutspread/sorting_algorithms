import java.util.Random;

public class BogoSort {

    public void run() {

        generateArray();

        bogoSort(generateArray());

    }

    private int[] generateArray() {
        Random rand = new Random();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    private void bogoSort(int[] array) {
        if (!isListSorted(array)) {
            generateArray();
            System.out.println("Before: ");
            printArray(generateArray());
            System.out.println("\n");
            bogoSort(generateArray());

        } else if (isListSorted(array)) {
            System.out.println("\nAfter: ");
            printArray(array);
            System.out.println("\n" + isListSorted(array));
        }
    }

    private void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private boolean isListSorted(int[] array) {
        if (array == null) {
            return true;
        }
        if (array.length <= 1) {
            return true;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}