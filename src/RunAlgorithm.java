import java.util.Scanner;

public class RunAlgorithm {

    private static final String[] ALGORITHM_LIST = {"merge", "quick", "insertion", "bubble"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which alg do you want to sort? " + String.join(", ", ALGORITHM_LIST) + "?: ");
        String algChoice = scanner.nextLine().trim().toLowerCase();

        System.out.println("What size array do you want to sort?: ");
        int arraySize = scanner.nextInt();

        final long startTime = System.currentTimeMillis();

        AlgorithmName algorithmName = AlgorithmName.fromValue(algChoice);
        SortingAlgorithm algorithm = null;

        switch (algorithmName) {
            case BOGO:
                algorithm = new BogoSort();
                break;
            case BUBBLE:
                algorithm = new BubbleSort();
                break;
            case INSERTION:
                algorithm = new InsertionSort();
                break;
            case MERGE:
                algorithm = new MergeSort();
                break;
            case QUICK:
                algorithm = new QuickSort();
                break;
            default:
                System.out.println("Fuck you");
        }

        if (algorithm != null) {
            int[] array = ArrayUtils.generate(arraySize);
            algorithm.sort(array);

            final long endTime = System.currentTimeMillis();
            System.out.println("\nTime taken: " + (endTime - startTime) + "ms");
        }
    }
}

//    private static String customJoin(String delimiter, String[] words) {
//        return;
//    }
