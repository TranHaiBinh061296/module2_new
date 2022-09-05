package introduction.docso_thanhchu;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number convert : ");
        int number = sc.nextInt();
        int first = number / 100;
        int second = (number % 100) / 10;
        int third = number % 10;
        String result = null;
        if (number < 0 || number > 999) {
            System.out.println("Out of range.");
        }
        if (number >= 0 && number < 10) {
            result = one2Nine(number);
            System.out.println(result);
            return;
        }
        if (number >= 10 && number < 20) {
            result = _10_to_19(third);
            System.out.println(result);
            return;
        }
        if (number >= 20 && number < 100) {
            if (third != 0) {
                result = _20_to_99(second) + " " + one2Nine(third);
                System.out.println(result);
            } else {
                result = _20_to_99(second);
                System.out.println(result);
            }

            return;
        }
        if (number >= 100 && number < 1000) {
            if (third == 0) {
                if (second == 0) {
                    result = _100_to_999(first);
                    System.out.println(result);
                }
                if (second < 2 && second > 0) {
                    result = _100_to_999(first) + " and " + _10_to_19(third);
                    System.out.println(result);
                } else if (second >= 2) {
                    result = _100_to_999(first) + " and " + _20_to_99(second);
                    System.out.println(result);
                }
            } else if (second == 0) {
                result = _100_to_999(first) + " and " + one2Nine(third);
                System.out.println(result);
                return;
            } else if (second < 2) {
                result = _100_to_999(first) + " and " + _10_to_19(third);
                System.out.println(result);
            } else {
                result = _100_to_999(first) + " and " + _20_to_99(second) + " and " + one2Nine(third);
                System.out.println(result);
            }
            return;
        }
    }

    public static String one2Nine(int number) {
        String donviStr = null;
        switch (number) {
            case 0:
                donviStr = "Zero";
                break;
            case 1:
                donviStr = " one ";
                break;
            case 2:
                donviStr = " two ";
                break;
            case 3:
                donviStr = "three";
                break;
            case 4:
                donviStr = " four ";
                break;
            case 5:
                donviStr = " five ";
                break;
            case 6:
                donviStr = " six ";
                break;
            case 7:
                donviStr = " seven ";
                break;
            case 8:
                donviStr = " eight ";
                break;
            case 9:
                donviStr = " nine ";
                break;
        }
        return donviStr;
    }

    public static String _10_to_19(int number) {
        String special = null;
        switch (number) {
            case 0:
                special = "Ten";
                break;
            case 1:
                special = "Elevent";
                break;
            case 2:
                special = "twelve";
                break;
            case 3:
                special = "Thirteen";
                break;
            case 4:
                special = " fourteen";
                break;
            case 5:
                special = "Fiveteen";
                break;
            case 6:
                special = " Sixteen";
                break;
            case 7:
                special = " Seventeen";
                break;
            case 8:
                special = " Eighteen";
                break;
            case 9:
                special = " Nineteen";
                break;
        }
        return special;
    }

    public static String _20_to_99(int number) {
        String second = null;
        switch (number) {
            case 2:
                second = "twenty";
                break;
            case 3:
                second = "thirty";
                break;
            case 4:
                second = "fourty";
                break;
            case 5:
                second = "fivety";
                break;
            case 6:
                second = "sixty";
                break;
            case 7:
                second = "seventy";
                break;
            case 8:
                second = "eighty";
                break;
            case 9:
                second = "ninety";
                break;
        }
        return second;
    }

    public static String _100_to_999(int number) {
        String first = null;
        switch (number) {
            case 1:
                first = "One hundred";
                break;
            case 2:
                first = "Two hundred";
                break;
            case 3:
                first = "Three hundred";
                break;
            case 4:
                first = "Four hundred";
                break;
            case 5:
                first = "Five hundred";
                break;
            case 6:
                first = "Six hundred";
                break;
            case 7:
                first = "Seven hundred";
                break;
            case 8:
                first = "Eight hundred";
                break;
            case 9:
                first = "Nine hundred";
                break;
        }
        return first;
    }
}
