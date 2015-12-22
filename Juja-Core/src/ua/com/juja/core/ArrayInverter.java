package ua.com.juja.core;

/**
 * Created by DM on 26.11.2015.
 */
public class ArrayInverter {
    public static void main(String[] args) {
        int[] array = {1, 0};
        ArrayInverter.invert ( array );
    }


    public static void invert(int[] arr) {

        int length = arr.length;

        for (int k = (length - 1) / 2; k >= 0; k--) {
            if (length <= 1 || arr == null) {
                continue;
            }


            int tmp = arr[k];
            arr[k] = arr[length - k - 1];
            arr[length - k - 1] = tmp;

        }
    }
}
