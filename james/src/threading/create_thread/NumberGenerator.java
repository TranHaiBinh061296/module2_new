package threading.create_thread;

public class NumberGenerator implements Runnable{
    private int number;

    public NumberGenerator(int i) {
        this.number = i;
    }

    @Override
    public void run() {
        try {
            int i = this.number;
            int j = 1;
            System.out.println("10 so sau " + number + " la: ");
            while (i < number + 10) {
                System.out.println(j + " : "+ i);
                j++;
                i++;
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("so luong toi da");
        }
        System.out.println("Hoan thanh");
    }

}
