package ua.com.juja.core;

/**
 * Created by DM on 21.12.2015.
 */


import java.util.Arrays;

public class ArrayUtilsTest2 {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1};
        int[] expected = {1, 3};
        int[] actual = ArrayUtils.lookFor ( array );

        if (!Arrays.equals ( actual, expected )) {
            throw new AssertionError ();
        }

        System.out.print ( "OK" );
    }
}