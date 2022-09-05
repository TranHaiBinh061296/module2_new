package threading.show_even_odd;

public class Main {
    public static void main(String[] args) {
        EvenThread numberEven = new EvenThread();
        OddThread numberOdd = new OddThread();

        numberEven.start();
        numberOdd.start();
        try {
            //chạy trước 200mili giây
            numberOdd.join(200);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
