package java_collection_framework.product_linkedlist;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        try {
            productManager.mainMenu();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
