package ua.com.juja.core;

/**
 * Created by DM on 26.11.2015.
 */
public class Test7 {
    public static void main(String[] args) {
        int[] array = {1, 0};
        ArrayInverter.invert(array);
        if (array[0] != 0 && array[1] != 1) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}