package ua.com.juja.core;

import java.util.Arrays;

/**
 * Created by DM on 28.11.2015.
 */
public class MergerTest2 {
    public static void main(String[] args) {
        int[] result = Merger.merge(new int[]{1}, new int[]{2});

        if (!Arrays.equals(result, new int[]{1, 2})) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}