package nl.example.volleybal.utils;

import java.time.DayOfWeek;

/*
This class is een eeuwigdurende calendar. before we had LocalDate this was very handy
 */
public final class DateCalculator {


    public static int getDayOfWeekNumber(int year, int month, int dayOfMonth) {

        //first map normal month to Roman month and year
        // from jan..dec => march, feb (that days March was the first month of the year
        // hence if month =1 month = 11 and belongs to previous year ...
        if (month == 1) {
            month = 11;
            year--;
        }
        else {
            if (month == 2) {
                month = 12;
                year--;
            }
            else {
                month -=2;
            }
        }

        int century = year / 100;
        year = year % 100;

        // Zeller's Formula
        int result = (dayOfMonth + (13 * month - 1) / 5 + year + year / 4 + century / 4 + 5 * century) % 7;

        return result;
    }

    public static DayOfWeek getDayOfWeekEnum(int year, int month, int dayOfMonth) {

        int result = getDayOfWeekNumber(year, month, dayOfMonth);

        if(result == 0) {
            result = 7; // to comply with day of week of DayOfWeek enum in Java (they call it a 7)
        }

        return DayOfWeek.of(result);
    }

    public static String getDayOfWeekEnglish(int year, int month, int dayOfMonth) {
        DayOfWeek enumDay = getDayOfWeekEnum(year, month, dayOfMonth);

        String stringDay = enumDay.toString();

        String output  = String.valueOf(stringDay.charAt(0))+stringDay.substring(1).toLowerCase();

        return output;
    }


    private DateCalculator() {

    }
}