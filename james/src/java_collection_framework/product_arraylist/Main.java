package java_collection_framework.product_arraylist;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product nokia = new Product(121,"Nokia", 5000);
        Product iphone = new Product( 201, "Iphone",10000);
        Product samsung = new Product( 302, "ip6 Plú", 7000);
        productManager.productList.add(nokia);
        productManager.productList.add(iphone);
        productManager.productList.add(samsung);
        productManager.menuManager();
    }
}
