package ua.com.juja.core;
        /*Если один из аргументов равен null - throw new IllegalArgumentException().
          2. Если один из аргументов НЕ прямоугольная/квадратная матрица - throw new IllegalArgumentException().
          3. Если одна из матриц содержит null в качестве строки - throw new IllegalArgumentException().
          4. Если ширина первой матрицы не равна высоте второй матрицы - throw new IllegalArgumentException().*/

/**
 * Created by DM on 22.10.2016.
 */
public class MatrixUtils {
    public static int[][] mul(int[][] fst, int[][] snd) {

        if (fst == null || snd == null) {
            throw new IllegalArgumentException ();
        }

        for (int i = 1; i < fst.length; i++) {
            if (fst[i - 1].length != fst[i].length && fst.length != fst[i].length) {
                throw new IllegalArgumentException ();
            }
        }

        int i, j, k;

        int[][] C = new int[fst.length][snd[0].length];


        for (i = 0; i < fst.length; i++) {
            for (j = 0; j < snd[i].length; j++) {
                for (k = 0; k < snd.length; k++) {

                    C[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }
        return C;
    }

}

