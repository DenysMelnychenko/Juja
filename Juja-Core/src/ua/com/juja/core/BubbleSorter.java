package ua.com.juja.core;

/**
 * Created by DM on 10.09.2016.
 */
public class BubbleSorter {
    public static void sort(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (arr[index] > arr[index + 1]) {
                    int tmp = arr[index + 1];
                    arr[index + 1] = arr[index];
                    arr[index] = tmp;
                }
            }
        }
    }
}
