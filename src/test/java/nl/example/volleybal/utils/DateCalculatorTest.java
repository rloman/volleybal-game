package nl.example.volleybal.utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateCalculatorTest {

    @Test
    public void testMyBirthDate() {

        int year = 1968;
        int month = 8; // augustus
        int dayOfMonth = 9;

        int dayNumber = DateCalculator.getDayOfWeekNumber(year, month, dayOfMonth);

        Assertions.assertEquals(5, dayNumber);
    }

    @Test
    public void testMyMarriageDate() {

        int year = 2001;
        int month = 5;
        int dayOfMonth = 23;

        int dayNumber = DateCalculator.getDayOfWeekNumber(year, month, dayOfMonth);

        Assertions.assertEquals(3, dayNumber);
    }

    @Test
    public void testMyChurchMarriageDate() {

        int year = 2001;
        int month = 7;
        int dayOfMonth = 14;

        int dayNumber = DateCalculator.getDayOfWeekNumber(year, month, dayOfMonth);

        Assertions.assertEquals(6, dayNumber);
    }

    @Test
    public void testMySisterMarriageDate() {

        int year = 2001;
        int month = 4;
        int dayOfMonth = 6;

        int dayNumber = DateCalculator.getDayOfWeekNumber(year, month, dayOfMonth);

        Assertions.assertEquals(5, dayNumber);
    }

    @Test
    public void testCurrentDate() {

        int year = 2018;
        int month = 5;
        int dayOfMonth = 17;

        int dayNumber = DateCalculator.getDayOfWeekNumber(year, month, dayOfMonth);

        Assertions.assertEquals(4, dayNumber);
    }

    @Test
    public void testThisYearMyBirthDay() {

        int year = 2018;
        int month = 8;
        int dayOfMonth = 9;

        int dayNumber = DateCalculator.getDayOfWeekNumber(year, month, dayOfMonth);

        Assertions.assertEquals(4, dayNumber);
    }

    @Test
    public void testMyBirthDateEnum() {

        int year = 1968;
        int month = 8; // augustus
        int dayOfMonth = 9;

        DayOfWeek dayOfWeek = DateCalculator.getDayOfWeekEnum(year, month, dayOfMonth);

        Assertions.assertEquals(DayOfWeek.FRIDAY, dayOfWeek);

    }

    @Test
    public void testMyBirthDateString() {

        int year = 1968;
        int month = 8; // augustus
        int dayOfMonth = 9;

        String dayOfWeek = DateCalculator.getDayOfWeekEnglish(year, month, dayOfMonth);

        Assertions.assertEquals("Friday", dayOfWeek);

    }

    @Test
    public void testWoutHisBirthday() { //10-12-1985

        int year = 2005;
        int month = 9;
        int dayOfMonth = 6;

        int dayNumber = DateCalculator.getDayOfWeekNumber(year, month, dayOfMonth);

        Assertions.assertEquals(2, dayNumber);

    }

    @Test
    public void testDateFromBook() { //10-12-1985

        int year = 1985;
        int month = 12; // december
        int dayOfMonth = 10;

        int dayNumber = DateCalculator.getDayOfWeekNumber(year, month, dayOfMonth);

        Assertions.assertEquals(2, dayNumber);

    }

    @Test
    public void testLarge() {
        LocalDate from = LocalDate.now().minusYears(150);
        LocalDate now = LocalDate.now();

        while (from.compareTo(now) <= 0) {
            Assertions.assertEquals(from.getDayOfWeek(), DateCalculator.getDayOfWeekEnum(from.getYear(), from.getMonthValue(), from.getDayOfMonth()));
            from = from.plusDays(1);
        }
    }

    @Test
    public void testFirstJan0000() {

        LocalDate eloyDay = LocalDate.of(0, 1, 1);

        Assertions.assertEquals(DayOfWeek.SATURDAY, eloyDay.getDayOfWeek());

        int dayNumberOfDateCalculator = DateCalculator.getDayOfWeekNumber(0, 1, 1);

        Assertions.assertEquals(0, dayNumberOfDateCalculator);
    }
}
