package ua.com.juja.core;

/**
 * Created by DM on 23.08.2016.
 */
import java.util.Arrays;

public class ArrayUtilTest3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1, 0};
        int[] expected = {0, 3};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
