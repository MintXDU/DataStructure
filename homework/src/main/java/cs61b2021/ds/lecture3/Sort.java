package cs61b2021.ds.lecture3;

public class Sort {

    public static void main(String[] args) {

    }
    /* Sorts strings destructively. */
    public static String[] sort(String[] input) {
        // Find the smallest item
        // Move it to the front
        // Selection sort in the rest (using recursion???)
        

        // Sort by using loop.
        sortLoop(input);
        return input;
    }
    /* Sort by using loop. */
    public static void sortLoop(String[] input) {
        for (int i = 0; i < input.length; i++) {
            int smallestIndex = findSmallestIndex(input, i, input.length - 1);

            swap(input, i, smallestIndex);
        }
    }

    /* Swap item a with b. */
    public static void swap(String[] x, int firstIndex, int smallestIndex) {
        String tempString;
        tempString = x[firstIndex];
        x[firstIndex] = x[smallestIndex];
        x[smallestIndex] = tempString;
    }

    /* Return the index of the smallest String in x. */
    public static int findSmallestIndex(String[] x, int s, int f) {
        int smallestIndex = s;

        for (int i = s; i <= f; i++) {
            if (x[i].compareTo(x[smallestIndex]) < 0) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
