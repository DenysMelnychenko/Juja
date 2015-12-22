package ua.com.juja.core;

/**
 * Created by DM on 24.11.2015.
 */
public class BitUtils {
    public static byte swapBits(byte b, int i, int j) {
        byte BiteI = (byte) ((b >> i) & 1);
        byte BiteJ = (byte) ((b >> j) & 1);
        if (BiteI != BiteJ) {
            int bstart = (byte) ((1 << j) | (1 << i));
            b = (byte) (b ^ bstart);
        }
        return b;
    }
}
