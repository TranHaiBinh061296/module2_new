package testfirst_tdd.absolute_number_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        if(number < 0)
            return  -number;
        return number;
    }
}
