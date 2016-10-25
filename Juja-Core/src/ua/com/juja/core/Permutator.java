package ua.com.juja.core;

/**
 * Created by DM on 10.10.2016.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutator {

    public static void main(String[] args) {
        int[] array = {1,2};
        Permutator.permutation ( array, array.length );

    }

    public static void permutation(int[] list, int size) {
        if (size < 2) {
            System.out.println ( Arrays.toString ( list ) );
        } else {
            for (int k = 0; k < size; k++) {
                swap ( list, k, size - 1 );
                permutation ( list, size - 1 );
                swap ( list, size - 1, k );
            }

        }
    }


    private static void swap(int[] list, int index0, int index1) {
        int tmp = list[index0];
        list[index0] = list[index1];
        list[index1] = tmp;
    }
}
