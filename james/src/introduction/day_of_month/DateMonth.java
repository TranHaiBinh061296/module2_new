package introduction.day_of_month;

import java.util.Scanner;

public class DateMonth {
    public static void main(String[] args) {

        System.out.println("Enter the number of months you want to find");
        Scanner mon = new Scanner(System.in);
        int month = mon.nextInt();
        String dayinmonth;
        switch (month) {
            case 2:
                dayinmonth = "28 or 29 day";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayinmonth = " 31 day";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayinmonth = "30 day";
                break;
            default:
                dayinmonth = "";
        }
        if (dayinmonth != "") {
            System.out.println("The number of days in " + month + " is " + dayinmonth );
        }
        else {
            System.out.println("Invalid number of months entered");
        }
    }

}
