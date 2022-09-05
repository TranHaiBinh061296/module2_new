package array.total;

public class Sum {
    //    public static boolean soduong(int num ) {
//        if ( num < 0 ) {
//            return false;
//        } else {
//            return true;
//        }
//    }
    public static void main(String[] args) {
        int[] array = {-2, 20, -4, 1, 2, 6, 9, 16, 20};
        int sum = 0;
        //Advanced for loop
        for (int num : array) {
            if (num >= 0 && num % 2 == 0) {
                sum = sum + num;
            }
        }
        System.out.println("Kết quả là:" + sum);
    }
}
