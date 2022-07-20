public class InsertionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        System.out.println("Before: ");
        ArrayUtils.printArray(array);

        insertionSort(array);

        System.out.println("\nAfter: ");
        ArrayUtils.printArray(array);
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