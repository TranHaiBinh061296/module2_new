package threading.find_prime;

public class Main {
    public static void main(String[] args) {
        try {
            Thread t1 = new Thread(new LazyPrimeFactorization(100));
            Thread t2 = new Thread(new OptimizedPrimeFactorization(100));
            t1.start();
            t2.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
