package threading.find_prime;

public class LazyPrimeFactorization implements Runnable {
    private int numberRanger;

    public LazyPrimeFactorization() {
        this.numberRanger = 0;
    }

    public LazyPrimeFactorization(int number) {
        this.numberRanger = number;
    }

    private boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) return false;
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
            } else {
                str = "Danh sach so nguyen to : ";
                int count = 0;
                while (i < numberRanger) {
                    if (isPrime(i)) {
                        count++;
                        str += i + " ";
                        System.out.println("Lazy prime " + count + " : " + i);
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
