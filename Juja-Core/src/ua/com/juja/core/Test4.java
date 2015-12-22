package ua.com.juja.core;

/**
 * Created by DM on 23.11.2015.
 */
public class Test4 {
    public static void main(String[] args) {
        if (IntegerUtils.rightShift(
                0b10000000_00000000_00000000_00000000) !=
                0b01000000_00000000_00000000_00000000) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}
