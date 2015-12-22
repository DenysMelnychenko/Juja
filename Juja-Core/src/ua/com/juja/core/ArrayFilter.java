package ua.com.juja.core;

/**
 * Created by DM on 27.11.2015.
 */
/*Отфильтровать массив так, чтобы оставить только четные элементы. Для проверки четности можно использовать операцию остаток от деления - %
        3 % 2 == 1;
        6 % 2 == 0;
        Исходящий массив для простоты, должен быть того же размера, что и входящий. Например, для {4, 3, 5, 6, 7, 9} -> {4, 6, 0, 0, 0, 0}*/
public class ArrayFilter {
    public static int[] filterEven(int[] nums) {
        int length = nums.length;
        int count = 0;
        int[] filterArray = new int[length];
        for (int i = 0; i < length; i++) {
            if ((nums[i] % 2) == 0) {

                filterArray[count] = nums[i];
                count++;
            }

        }
        return filterArray;

    }
}

