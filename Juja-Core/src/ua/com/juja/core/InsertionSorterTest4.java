package ua.com.juja.core;

/**
 * Created by DM on 15.09.2016.
 */
 import java.util.Arrays;

    public class InsertionSorterTest4 {
        public static void main(String[] args) {
            // fill elements
            int[] array = new int[] {3, 1, 2, 4};
            // library sort
            int[] expected = array.clone();
            Arrays.sort(expected);
            // lab sort
            int[] actual = array.clone();
            InsertionSorter.sort(actual);
            // compare results: library vs lab
            if (!Arrays.equals(actual, expected)) {
                throw new AssertionError("expected = " + Arrays.toString(expected) + " but actual  = " + Arrays.toString(actual));
            }

            System.out.print("OK");
        }
    }

