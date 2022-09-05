package threading.find_prime;

import java.util.regex.Matcher;

public class OptimizedPrimeFactorization implements Runnable{
    private int numberRanger;

    public OptimizedPrimeFactorization() {
        this.numberRanger = 0;
    }

    public OptimizedPrimeFactorization(int number) {
        this.numberRanger = number;
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number == 3) return true;
        int maxRanger = (int) Math.floor(Math.sqrt(number));
        for (int i = 2; i < maxRanger; i++) {
            if (number % 2==0) return false;
        }
        return true;
    }
    @Override
    public void run() {
        String str = "";
        try {
            int i = 2;
            if (i > numberRanger) {
                str = "Khong co so nguyen to";
                int count = 0;
                while (i <= numberRanger) {
                    if (isPrime(i)) {
                        count++;
                        str += i + " ";
                        System.out.println("So nguyen to duoc toi uu hoa");
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Complete ! ");
        System.out.println(str);
    }
}
