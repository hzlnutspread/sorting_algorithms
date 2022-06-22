import java.util.Scanner;

public class RunAlgorithm {

    private static final String[] ALGORITHM_LIST = {"merge", "quick", "insertion"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which alg do you want to run?: " + String.join(", ", ALGORITHM_LIST) + "?: ");
        String algChoice = scanner.nextLine().trim();

        System.out.println("What size array do you want to sort?: ");
        int arraySize = scanner.nextInt();

        final long startTime = System.currentTimeMillis();

        if (algChoice.equalsIgnoreCase("merge")) {
            MergeSort mergeSort = new MergeSort();
            mergeSort.run(arraySize);

        } else if (algChoice.equalsIgnoreCase("quick")) {
            QuickSort quickSort = new QuickSort();
            quickSort.run(arraySize);

        } else if (algChoice.equalsIgnoreCase("insertion")) {
            InsertionSort insertionSort = new InsertionSort();
            insertionSort.run(arraySize);

        } else {
            System.out.println("fuck you");
        }

        final long endTime = System.currentTimeMillis();
        System.out.println("\nTime taken: " + (endTime - startTime) + "ms");

    }


//    private static String customJoin(String delimiter, String[] words) {
//        return;
//    }

}
