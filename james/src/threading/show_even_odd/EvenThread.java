package threading.show_even_odd;

public class EvenThread extends Thread{

    private int number;

    public EvenThread() {
        number = 0;
    }

    public EvenThread(int number) {
        this.number = number;
    }


    @Override
    public void run() {
        int i;
        if (number % 2 == 0) {
            i = number;
        } else i = number + 1;
        int j =1;
        try {
            while (j <=10) {
                System.out.println("Even number : " + j + " : " + i);
                j++;
                i= i +2;
                Thread.sleep(15);
            }
        }catch (Exception e) {
            System.out.println("Number max size");
        }
        System.out.println("Complete ! ");
    }
}
