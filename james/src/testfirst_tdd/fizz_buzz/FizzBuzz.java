package testfirst_tdd.fizz_buzz;

public class FizzBuzz {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return "FizzBuzz";
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";
        return readNumberSmaller100(number);
    }
    public  static String checkNumOfNumber(int number){
        boolean isFizz = number / 10 ==3 || number % 10 ==3 ;
        boolean isBuzz = number / 10 ==5 || number % 10 ==5;
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";
        return readNumberSmaller100(number);
    }

    public static String readNumberSmaller100(int number) {
        boolean isNumDivision10AndBigger10 = number % 10 == 0 && number != 10;
        boolean isNUmSmaller10 = number < 10;
        boolean isNum11To19 = number > 10 && number < 20 ;
        boolean is10 = number == 10;

        if (isNumDivision10AndBigger10) return readNumSmaller10(number / 10) + " mươi";
        if(is10) return "mười" ;
        if(isNum11To19) return "mười " + readNumSmaller10(number%10) ;
        if (isNUmSmaller10) return readNumSmaller10(number);
        return readNumSmaller10(number / 10) +" muoi  "+ readNumSmaller10(number);
    }


    private static String readNumSmaller10(int number) {
        String str ="" ;
        switch (number) {
            case 1:
                str = "một";
                break;
            case 2:
                str = "hai";
                break;
            case 3:
                str = "ba";
                break;
            case 4:
                str = "bốn";
                break;
            case 5:
                str = "năm";
                break;
            case 6:
                str = "sáu";
                break;
            case 7:
                str = "bảy";
                break;
            case 8:
                str = "tám";
                break;
            case 9:
                str = "chín";
                break;
        }
        return str ;
    }
}
