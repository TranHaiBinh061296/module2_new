package java_collection_framework.product_arraylist;

import java.util.Comparator;

public class PriceAscComparator implements Comparator<Product> {
    @Override
    public int compare(Product productOne, Product productTwo) {
        if (productOne.getPrice() > productTwo.getPrice()) {
            return 1;
        } else if (productOne.getPrice() == productTwo.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
