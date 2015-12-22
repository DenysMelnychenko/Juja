package ua.com.juja.core;

/**
 * Created by DM on 26.11.2015.
 */
public class Test6 {
    public static void main(String[] args) {
        int[] array = {0};
        ArrayInverter.invert(array);
        if (array[0] != 0) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
