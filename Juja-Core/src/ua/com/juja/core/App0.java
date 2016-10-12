package ua.com.juja.core;

/**
 * Created by DM on 04.10.2016.
 */
public class App0 {

    public static void main(String[] args) {
        int[] array = {10, 20, 3, 8, 40, 25, -18, 36};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }

        }

        System.out.println ( "максимум = " + max );

    }
}
