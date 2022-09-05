package testfirst_tdd.next_day;

public class NextDayCalculator {
    public NextDayCalculator() {
    }

    public NextDayCalculator(int day, int month, int year) {
    }

    public static String nextDayCalculator(int day, int month, int year) {
        String nextDay = "";
        boolean isYear = year > 0;
        boolean isMonth = month <= 12 && month >= 1;


        if (isYear) {
            if (isMonth) {
                int numDay = numberDayOfMonth(month, year);
                boolean isDayOfMonth = day <= numDay && day >= 1;
                boolean isLastDayOfMonth = day == numDay;
                boolean isLastMonthOfYear = month == 12;

                if (isDayOfMonth) {
                    if (isLastDayOfMonth) {
                        nextDay += 1 + "-";
                        if (isLastMonthOfYear) {
                            nextDay += 1 + "-" + (year + 1);
                        } else nextDay += (month + 1) + "-" + year;
                    } else nextDay = (day + 1) + "-" + month + "-" + year;
                } else nextDay = "Not next day !";
            } else nextDay = "Not next day !";
        } else nextDay = "Not next day !";
        return nextDay;
    }

    public static boolean isYearLeap(int year) {
        boolean isDivision400 = year % 400 == 0;
        boolean isDivision100 = year % 100 == 0;
        boolean isDivision4 = year % 4 == 0;
        if (isDivision400 || (isDivision4 && !isDivision100)) return true;
        return false;
    }

    public static int numberDayOfMonth(int month, int year) {
        int numDay;
        switch (month) {
            case 2:
                if (isYearLeap(year)) numDay = 29;
                else numDay = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDay = 30;
                break;
            default:
                numDay = 31;
        }
        return numDay;
    }
}
