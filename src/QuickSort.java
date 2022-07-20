import java.util.Random;

public class QuickSort implements SortingAlgorithm{

    @Override
    public void sort(int[] array) {
        // print out the unsorted array
        System.out.print("Unsorted array: ");
        ArrayUtils.printArray(array);

        // run the quicksorting algorithm
        quicksort(array);

        // print out the sorted array
        System.out.print("\nSorted array: ");
        ArrayUtils.printArray(array);
    }

    // overloaded method. Makes code cleaner, so you only have to pass in the array
    private void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        // 1. choose the pivot randomly
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        // 2. Partition either side of the pivot

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        // 3. Recursively perform the partitioning
        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);

    }

    private int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            // we want to swap the numbers at lp and rp
            swap(array, leftPointer, rightPointer);
        }

        // want to swap the leftpointer with the highindex (which will be the last element in our array)
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}