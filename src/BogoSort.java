import java.util.Random;

public class BogoSort {

    public void run(int size) {

        int[] array = generateArray(size);

        bogoSort(array);

    }

    private int[] generateArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    private void bogoSort(int[] array) {
        if (!isListSorted(array)) {
            int[] newArray = generateArray(array.length);
            System.out.println("Before: ");
            printArray(newArray);
            System.out.println("\n");
            bogoSort(newArray);

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