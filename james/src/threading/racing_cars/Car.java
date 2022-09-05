package threading.racing_cars;


import java.util.Random;

import static threading.racing_cars.Main.DISTANCE;
import static threading.racing_cars.Main.STEP;

public class Car implements Runnable {

    //Khai báo tên c?a xe ?ua
    private String name;

    public Car(String nane) {
        this.name = nane;
    }

    @Override
    public void run() {
        // Kh?i t?o ?i?m start(hay km ban ??u)
        int runDistance = 0;
        //kh?i t?o time b?t ??u cu?c ?ua
        long startTime = System.currentTimeMillis();

        //kiểm tra chừng nào còn xa chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                //Random speed km/h
                int speed = (new Random()).nextInt(20);
                // Calculate qu?ng ???ng ?ã ?i
                runDistance += speed;
                //Xây dựng đối tượng
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
