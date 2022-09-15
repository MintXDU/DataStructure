package cs61b2021.ds.lecture3;

import org.junit.Assert;

/* 
 * Tests the Sort class.
 */
public class TestSort {
    /* Test the Sort.sort method. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expecteds = {"an", "egg", "have", "i"};

        String[] actuals = Sort.sort(input);
        /* 
         * "!=" will compare the address of two objects in java.
         */
        /* if (input != expected) {
            System.out.println("Error! There seems to be a problem with Sort.sort.");
        } */

        /* Ad Hoc Testing is Not fun. */
        /* for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i]);
            }
        }

        if (!Arrays.equals(input, expected)) {
            System.out.println("Error! There seems to be a problem with Sort.sort.");
        } */

        /* A Simple JUnit Test. */
        Assert.assertArrayEquals(expecteds, actuals);
    }

    public static void main(String[] args) {
        testSort();
    }
}
