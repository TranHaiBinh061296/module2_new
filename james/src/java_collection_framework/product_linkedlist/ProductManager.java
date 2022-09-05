package java_collection_framework.product_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    private LinkedList<Product> productList;

    public ProductManager() {
        productList = new LinkedList<>();
        this.productList = productList;
    }
    public void mainMenu() throws IllegalAccessException {
        char choice = '!';
        while (choice != '0') {
            System.out.println("Menu Product Manager");
            System.out.println("1. Add product");
            System.out.println("2. Edit product with id");
            System.out.println("3. Find product with name");
            System.out.println("4. Remove product with id");
            System.out.println("5. Display product list");
            System.out.println("6. Sort in ascending order of price");
            System.out.println("7. Sort in decrease oder of price");
            System.out.println("0. Exit");
            System.out.println("****************");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextLine().charAt(0);

            switch (choice) {
                case '1' :
                    addProduct();
                    break;
                case '2' :
                    setProductListWithID();
                    break;
                case '3' :
                    findProductWithName();
                    break;
                case '4' :
                    removeProductWithID();
                    break;
                case '5' :
                    displayProduct();
                    break;
                case '6' :
                    sortAscendingProduct();
                    break;
                case '7' :
                    sortDecreaseProduct();
                    break;
                case '0' :
                    System.exit(0);
                    break;
                default :
                    throw new IllegalAccessException("Unexpected value :" + choice);

            }
        }
    }



    // kiểm tra xem đã có sản phẩm trong list  chưa?
    public boolean isThereAnyProductOnTheList(Product product) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products == product) {
                    return true;
                }
            }
        }
        return false;
    }

    // kiểm tra xem đã có id trong list chưa?
    public boolean isThereAProductID(int id) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getId() == id) {
                    return  true;
                }
            }
        }
        return false;
    }

    // kiểm tra xem đã có tên trong list chưa?
    public boolean isNameAProductList(String name) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getName().equalsIgnoreCase(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addProduct() {
        int id;
        String name;
        double price;

        Scanner sc = new Scanner(System.in);

        // nhập  name, nếu  name nhập vào đã có thì phải nhập lại
        do {
            System.out.println("Product name: ");
            name = sc.nextLine();
            if(isNameAProductList(name)){
                System.out.println("Product have had in the product list ");
            }
        } while (isNameAProductList(name));

        // nhập vào id, nếu id nằm trong list thì phải nhập lại
        do {
            System.out.println("Product id: ");
            id = sc.nextInt();
            if(isThereAProductID(id)) {
                System.out.println("Id had in the product list");
            }
        } while (isThereAProductID(id));

        System.out.println("Product price: ");
        price = sc.nextDouble();
        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);
    }

    public void setProductListWithID() throws IllegalAccessException {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list");
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println("Product id need edit");
            int id = input.nextInt();

            if(isThereAProductID(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("Product have id is " + id + ": " + product);
                        char choice;

                        do {
                            System.out.println("Menu edit Product");
                            System.out.println("1. Eidt name product");
                            System.out.println("2. Edit id product");
                            System.out.println("3. Edit price product");
                            System.out.println("0. Back to menu");
                            System.out.println("**************");
                            Scanner sc = new Scanner(System.in);
                            choice = sc.nextLine().charAt(0);

                            switch (choice) {
                                case '1' :
                                    System.out.println("New name ");
                                    String newName = sc.nextLine();
                                    product.setName(newName);
                                    break;
                                case '2' :
                                    System.out.println("New Id ");
                                    int newID = sc.nextInt();
                                    product.setId(newID);
                                    break;
                                case '3' :
                                    System.out.println("New Price: ");
                                    int newPrice = sc.nextInt();
                                    product.setPrice(newPrice);
                                    break;
                                case '0' :
                                    mainMenu();
                                    break;
                            }
                        } while (choice != 0);
                    }
                }
            }
        }
    }
    public void sortDecreaseProduct() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in list!");
        } else {
            PriceDESC priceDescreaseComparator = new PriceDESC();
            Collections.sort(productList, priceDescreaseComparator);
            int i = 1; // số thứ tự
            for (Product product : productList) {
                System.out.println(i + ": " + product.toString());
                i++;
            }
        }
    }

    public void sortAscendingProduct() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list ");
        } else {
            PriceASC priceAscendingComparator = new PriceASC();
            Collections.sort(productList, priceAscendingComparator);
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ": " + product.toString());
            }
        }
    }

    public void displayProduct() {
        if (productList.isEmpty()) {
            System.out.println("There are no  product in the list ");
        } else {
            // số thứ tự
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ": "  + product.toString());
                i++;
            }
        }
    }

    public void removeProductWithID() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list ");
        }
        else {
            Scanner input = new Scanner(System.in);
            System.out.println("Product id need remove ");
            int id = input.nextInt();
            if (isThereAProductID(id)) {
                for (Product product : productList) {
                    if (product.getId() == id) {
                        System.out.println("product remove is :" + product.toString());
                        productList.remove(product);
                    }
                }
            }
            else {
                System.out.println("id have not in product list");
            }
        }
    }

    public void findProductWithName() {
//        String result = "";
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Product need find: ");
            String name = sc.nextLine();
            if (isNameAProductList(name)) {
                for (Product product : productList) {
                    if (product.equals(name)) {
                        System.out.println(product.getName());
                    }
                }
            }
        }
//        return result;
    }
}