public class BogoSort implements SortingAlgorithm {


    @Override
    public void sort(int[] array) {
        if (!isListSorted(array)) {
            int[] newArray = ArrayUtils.generate(array.length);
            System.out.println("Before: ");
            ArrayUtils.printArray(newArray);
            System.out.println("\n");
            sort(newArray);
        } else {
            System.out.println("\nAfter: ");
            ArrayUtils.printArray(array);
            System.out.println("\n" + isListSorted(array));
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