package ua.com.juja.core;

/**
 * Created by DM on 26.08.2016.
 */
import java.util.Arrays;

public class ArrayUtilTest5 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0};
        int[] expected = {1, 4};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
