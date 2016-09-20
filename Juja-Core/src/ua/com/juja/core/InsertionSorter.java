package ua.com.juja.core;

import java.util.Arrays;

/**
 * Created by DM on 12.09.2016.
 */

/*
реализована не оптимально, так как внутренний цикл while
        - ищет позицию для вставки, перебирая последовательно элементы, при этом он
        - поэлементно "смещает" массив.

        В целях оптимизации перепишите алгоритм:
        1. Ищите позицию для вставки элемента бинарным поиском (Arrays.binarySearch(...)).
        2. Найдя позицию - смещайте всю часть массива за один вызов (System.arraycopy(...)).
        В моих экспериментах эти две оптимизации ускорили сортировку в 2.2-2.6 раза. Скорость сортировки измерял данным кодом
*/


public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = Arrays.binarySearch ( arr, 0, k, newElement );

            if (location >= 0) {
                System.arraycopy ( arr, location, arr, location + 1, k - location );
                arr[location] = newElement;

            } else {
                int currentPosition = Math.abs ( location ) - 1;

                System.arraycopy ( arr, currentPosition, arr, currentPosition + 1, k - currentPosition );
                arr[currentPosition] = newElement;

            }

        }

    }

    public static int position(int[] arr) {
        int index = Arrays.binarySearch ( arr, 0, arr.length - 1, 4 );

        return index;
    }
}

