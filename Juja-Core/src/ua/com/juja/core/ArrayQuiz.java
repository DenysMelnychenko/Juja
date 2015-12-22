package ua.com.juja.core;

import java.util.Arrays;

/**
 * Created by DM on 26.11.2015.
 */
public class ArrayQuiz {

    public static void main(String[] args) {

        String[] array1 = {"a", "b", "c", "d", "f"};
        invert ( array1 );
        System.out.println ( array1.toString () );
    }

    public static void invert(String[] arr) {
        for (int k = 0; k <= arr.length / 2; k++) {
            String tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;
        }

    }

}

