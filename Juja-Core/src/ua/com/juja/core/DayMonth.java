package ua.com.juja.core;

/**
 * Created by DM on 21.11.2015.
 */
public class DayMonth {
    public static String getMonthOfYear(int number) {

            if (number == 1)
                return "january";
        if (number == 2)
                return "february";
        if (number == 3)
                return "march";
        if (number == 4)
                return "april";
        if (number == 5)
                return "may";
        if (number == 6)
                return "june";
        if (number == 7)
                return "july";
        if (number == 8)
                return "august";
        if (number == 9)
                return "september";
        if (number == 10)
                return "october";
        if (number == 11)
                return "november";
        if (number == 12)
                return "december";
            return "";

    }
}

