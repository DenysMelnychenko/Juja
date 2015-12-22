package ua.com.juja.core;

/**
 * Created by DM on 28.11.2015.
 */

public class Merger {
    // wrong
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        int resIndex = 0;
        while ((fstIndex < fst.length) && (sndIndex < snd.length)) {
            if (fst[fstIndex] < snd[sndIndex]) {
                result[resIndex] = fst[fstIndex++];

            } else {
                result[resIndex] = snd[sndIndex++];
            }
            resIndex++;
        }
        while (fstIndex < fst.length) {
            result[resIndex] = fst[fstIndex];
            resIndex++;
            fstIndex++;
        }

        while (sndIndex < snd.length) {
            result[resIndex] = snd[sndIndex];
            sndIndex++;
            resIndex++;
        }


        return result;
    }
}

/*public class Merger {
    // wrong
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        if (fst.length != 0 & snd.length != 0) {
            int i, j;
            for (i = 0; i < fst.length; i++) {
                for (j = 0; j < snd.length; j++) {
                    if ((j < snd.length && i < fst.length) && fst[i] <= snd[j]) {
                        result[i + j] = fst[i];

                    } else if ((j < snd.length && i < fst.length)) {
                        result[i + j] = snd[j];


                    }
                }

            }
        } else if (fst.length == 0 && snd.length != 0) {
            int sndIndex1 = 0;
            while (sndIndex1 != result.length) {
                result[sndIndex1] = snd[sndIndex1++];
            }
        } else if (snd.length == 0 && fst.length != 0) {
            int fstIndex1 = 0;
            while (fstIndex1 != result.length) {
                result[fstIndex1] = fst[fstIndex1++];
            }
        }

        return result;
    }
}*/
