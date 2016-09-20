package ua.com.juja.core;

/**
 * Created by DM on 27.08.2016.
 */
public class ArrayUtils1 {
    public static int[] lookFor(int[] array) {
        int[] empty = new int[0];
        int[] current = new int[2];
        int counterOfCurrentLength = 0;
        int counterOfMaxLength = 0;
        int leftIndex = 0;
        int rightIndex = 0;


        if (array.length == 0 || (array.length == 1 && (array[0] <= 0))) {
            return empty;
        } else if (array.length == 1 && (array[0] > 0)) {
            current[0] = leftIndex;
            current[1] = rightIndex;
            return current;

        } else if (array.length > 1) {

            for (int i = 0; i < array.length; i++) {

                if (array[i] > 0) {
                    leftIndex = i - counterOfCurrentLength;
                    rightIndex = i;
                    counterOfCurrentLength++;
                    if (counterOfCurrentLength > counterOfMaxLength) {

                        counterOfMaxLength = counterOfCurrentLength;
                        current[0] = leftIndex;
                        current[1] = rightIndex;
                    } else if (counterOfCurrentLength == counterOfMaxLength) {
                        current[0] = leftIndex;
                        current[1] = rightIndex;
                    }


                } else {
                    if (array[i] == 0) {

                        leftIndex = leftIndex + 1;
                        counterOfCurrentLength = 0;
                    }

                }

            }
        }
        return current;

    }
}

