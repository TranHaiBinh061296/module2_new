package threading.runnabledemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunnableDemo run1 = new RunnableDemo("Thread-1-HR-Database");
        run1.start();

        RunnableDemo run2 = new RunnableDemo("Thread-2-Send-Email");
        run2.start();

        System.out.println("Main thread stopped !!!");
    }
}
