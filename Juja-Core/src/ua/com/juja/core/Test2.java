package ua.com.juja.core;

/**
 * Created by DM on 23.11.2015.
 */
public class Test2 {
    public static void main(String[] args) {
        if (IntegerUtils.rightShift(
                0b00000000_00000000_00000000_00000001) !=
                0b10000000_00000000_00000000_00000000) {
            throw new AssertionError();
        }

        System.out.print("OK");
    }
}

