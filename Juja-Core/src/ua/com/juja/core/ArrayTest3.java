package ua.com.juja.core;

/**
 * Created by DM on 27.11.2015.
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int [] nums = {4,3,5,2,7,3};
        int [] evens = ArrayFilter.filterEven(nums);

        if (arraysEquals(evens, new int [] {4,2})){
            System.out.print("OK");
        }
    }

    private static boolean arraysEquals(int[] actual, int[] expected) {
        for (int i = 0; i < expected.length; i++) {
            if (actual[i] != expected[i]) return false;
        }
        return true;
    }

}
