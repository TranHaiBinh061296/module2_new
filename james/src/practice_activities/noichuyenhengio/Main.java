package practice_activities.noichuyenhengio;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        // Timer = 		Một cơ sở để các luồng lên lịch các tác vụ để thực thi
        // trong tương lai trong một luồng nền

        // TimerTask = 	Một tác vụ có thể được lên lịch
        // để thực hiện một lần hoặc lặp lại bởi Bộ hẹn giờ

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int counter = 15;
            @Override
            public void run() {
                if(counter>0) {
                    System.out.println(counter+" seconds");
                    counter--;
                }
                else {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2020);
        date.set(Calendar.MONTH,Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,45);
        date.set(Calendar.MILLISECOND,0);

        //timer.schedule(task, 0);
        //timer.schedule(task, date.getTime());
        //timer.scheduleAtFixedRate(task, 0, 1000);
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }

}
