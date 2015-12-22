package ua.com.juja.core;

/**
 * Created by DM on 27.11.2015.
 */
public class ArrayTest2 {
public static void main(String[] args) {
        int[] array = {3, 2, 1, 0};
        ArrayInverter.invert(array);
        if (array[0] != 0
        || array[1] != 1
        || array[2] != 2
        || array[3] != 3) {
        throw new AssertionError();
        }

        System.out.print("OK");
        }
        }
