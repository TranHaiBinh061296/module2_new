package testfirst_tdd.fizz_buzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Test : 3")
    public void testFizzBuzz3() {
        int num = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(num);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test : 5")
    public void testFizzBuzz5() {
        int num = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(num);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test : 15")
    public void testFizzBuzz15() {
        int num = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(num);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test : 13")
    public void testFizzBuzz13() {
        int num = 13;
        String expected = "mười ba";
        String result = FizzBuzz.fizzBuzz(num);
        assertEquals(expected, result);
    }
}
