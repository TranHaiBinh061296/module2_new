package threading.show_even_odd;

public class OddThread extends Thread {
    private int number;

    public OddThread() {
        number = 0;
    }

    public OddThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int i;
        if (number % 2 != 0) {
            i = number;
        } else {
            i = number + 1;
        }
        try {
            int j = 0;
            while (j <= 10) {
                System.out.println("Number odd : " + j + " : " + i);
                j++;
                i = i + 2;
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println("Number max size");
        }
        System.out.println("Complete !");
    }
}
