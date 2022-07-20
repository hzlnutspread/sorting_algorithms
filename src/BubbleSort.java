public class BubbleSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        System.out.println("Before: ");
        ArrayUtils.printArray(array);

        bubbleSort(array);

        System.out.println("\nAfter: ");
        ArrayUtils.printArray(array);
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
}