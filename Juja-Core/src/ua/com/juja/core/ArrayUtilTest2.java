package ua.com.juja.core;

/**
 * Created by DM on 23.08.2016.
 */
import java.util.Arrays;

public class ArrayUtilTest2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1};
        int[] expected = {1, 3};
        int[] actual = ArrayUtils.lookFor(array);

        if (!Arrays.equals(actual, expected)) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
