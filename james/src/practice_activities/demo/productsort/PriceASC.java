package practice_activities.demo.productsort;


import practice_activities.demo.model.Product;

import java.util.Comparator;

public class PriceASC implements Comparator<Product> {

    @Override
    public int compare(Product prt1, Product prt2) {
        if (prt1.getPrice() > prt2.getPrice()) {
            return 1;
        } else if (prt1.getPrice() < prt2.getPrice()) {
            return -1;
        }
        return 0;

    }
}
