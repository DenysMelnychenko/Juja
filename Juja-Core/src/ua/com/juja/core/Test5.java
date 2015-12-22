package ua.com.juja.core;

/**
 * Created by DM on 23.11.2015.
 */
public class Test5 {
    public static void main(String[] args) {
        if (IntegerUtils.rightShift(
                0b01010101_01010101_01010101_01010101) !=
                0b10101010_10101010_10101010_10101010) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
