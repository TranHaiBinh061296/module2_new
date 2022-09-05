package debug.arrayindex;

import java.util.Random;

public class ArrayIndex {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer [] arrs = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = rd.nextInt(100);
            System.out.println(arrs[i] + " ");
        }
        return arrs;
    }

}
