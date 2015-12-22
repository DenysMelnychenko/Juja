package ua.com.juja.core;

import java.util.Arrays;

/**
 * Created by DM on 28.11.2015.
 */
public class MergerTest {
    public static void main(String[] args) {
        int[] result = Merger.merge(new int[]{}, new int[]{1});

        if (!Arrays.equals(result, new int[]{1})) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}