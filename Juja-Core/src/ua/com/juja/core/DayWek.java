package ua.com.juja.core;

/**
 * Created by DM on 21.11.2015.
 */
public class DayWek {

    public static String getDayOfTheWeek(int dayNum){
        if (dayNum == 1) return "Monday";
        if (dayNum == 2) return "Tuesday";
        if (dayNum == 3) return "Wednesday";
        if (dayNum == 4) return "Thursday";
        if (dayNum == 5) return "Friday";
        if (dayNum == 6) return "Saturday";
        if (dayNum == 7) return "Sunday";
        return "";

    }
}