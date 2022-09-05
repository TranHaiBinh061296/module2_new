package testfirst_tdd.next_day;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NextDayTest {
    @Test
    @DisplayName("1/1/2018")
    void nextDay1And1And2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-1-2018";

        String result = NextDayCalculator.nextDayCalculator(1, 1, 2018);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("31/1/2018")
    void nextDay31And1And2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1-2-2018";

        String result = NextDayCalculator.nextDayCalculator(31, 1, 2018);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("30/4/2018")
    void nextDay30And4And2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1-5-2018";

        String result = NextDayCalculator.nextDayCalculator(30, 4, 2018);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("28/2/2018")
    void nextDay28And2And2018() {
        String expected = "1-3-2018";

        String result = NextDayCalculator.nextDayCalculator(28, 2, 2018);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("29/2/2018")
    void nextDay29And2And2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1-3-2020";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("2/1/2018")
    void nextDay2And1And2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "3-1-2018";

        String result = NextDayCalculator.nextDayCalculator(2, 1, 2018);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("1/2/2018")
    void nextDay1And2And2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-2-2018";

        String result = NextDayCalculator.nextDayCalculator(1, 2, 2018);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("1/5/2018")
    void nextDay1And5And2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-5-2018";

        String result = NextDayCalculator.nextDayCalculator(1, 5, 2018);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("1/3/2018")
    void nextDay1And3And2018() {
        int day = 1;
        int month = 3;
        int year = 2018;
        String expected = "2-3-2018";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("1/3/2020")
    void nextDay1And3And2020() {
        int day = 1;
        int month = 3;
        int year = 2020;
        String expected = "2-3-2020";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("1/1/2019")
    void nextDay1And1And2019() {
        int day = 1;
        int month = 1;
        int year = 2019;
        String expected = "2-1-2019";

        String result = NextDayCalculator.nextDayCalculator(day, month, year);
        Assertions.assertEquals(expected, result);
    }
}
