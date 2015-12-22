package ua.com.juja.core;

/**
 * Created by DM on 21.11.2015.
 */
public class Bytes {
    public static void main(String[] args) {
        int x = 0, y = 0, z = 0, t = 0;

        if ((x++ != 0 && y++ != 0) & (z++ != 0 & t++ != 0)) {/*NOP*/}

        System.out.print(x + "" + y + "" + z + "" + t);
    }
}

