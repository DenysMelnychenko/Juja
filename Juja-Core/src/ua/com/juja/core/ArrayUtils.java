package ua.com.juja.core;

/**
 * Created by DM on 20.12.2015.
 */
/*На вход подается одномерный массив. Необходимо, найти диапазон максимальной ширины, элементы которого положительные (больше 0)
        В качестве ответа должен быть массив из 2х элементов, где
        - элемент №0 - индекс элемента левой границы отрезка
        - элемент №1 - индекс элемента правой границы отрезка
        Если таких отрезков несколько - вернуть самый левый. Если в массиве нету такого отрезка (все числа отрицательны) - вернуть пустой массив.
        Например
        lookFor([1, 1, 1]) = [0, 2]
        lookFor([0, 1, 1]) = [1, 2]
        lookFor([1, 1, 0]) = [0, 1]
        lookFor([0, -100, 1, 1, 0, -1]) = [2, 3]
        lookFor([1, 1, 0, 1, 1]) = [0, 1] // возвращаем левый
        lookFor([0, -1, 0, -1]) = []*/ // нету положительных чисел

public class ArrayUtils {
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
                    }


                } else {
                    if (array[i] == 0) {
                        counterOfCurrentLength = 0;
                        leftIndex = leftIndex + 1;
                    } else if (counterOfCurrentLength > counterOfMaxLength) {

                        counterOfMaxLength = counterOfCurrentLength;
                        current[0] = leftIndex;
                        current[1] = rightIndex;

                        counterOfCurrentLength = 0;


                    }

                }

            }
        }
        return current;

    }
}


