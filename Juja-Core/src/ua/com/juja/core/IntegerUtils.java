package ua.com.juja.core;

/**
 * Created by DM on 23.11.2015.
 */
public class IntegerUtils {

    public static void main(String[] args) {
        //   int x = 0b10000011_00000100 << 1;

        //  String resx = String.format("%16s", Integer.toBinaryString(x)).replace(' ', '0');
        //  System.out.println("resx: " + resx);
        System.out.println(IntegerUtils.rightShift(0b00000000_00000000_00000000_00000001));
    }                                             /* 0b00000000_00000000_00000000_00000001
                                                   0b10101010_10101010_10101010_10101011*/

    public static int leftShift(int arg) {

        int hiBit = 0b10000000_00000000_00000000_00000000 & arg;
        if (hiBit != 0) {
            hiBit = 1;
        }
        return arg << 1 | hiBit;

    }


        public static int rightShift(int arg) {
            int x = 1;
            arg =(arg >>> x | arg << -1);
            return arg;
        }


    /*public static int rightShift(int arg) {
        int hiBit = 0b10000000_00000000_00000000_00000000 & arg;
        if (hiBit != 0){
            hiBit = -1;
        }
            arg = (arg >> 1) | hiBit;
            return arg;
    }*/
}