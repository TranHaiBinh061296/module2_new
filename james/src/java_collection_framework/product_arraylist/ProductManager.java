package java_collection_framework.product_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public ArrayList<Product> productList;

    public ProductManager() {
        ArrayList<Product> productList = new ArrayList<>();
        this.productList = productList;
    }

    // kiểm tra xem có sản phẩm trong list chưa?
    public boolean isThereAnyProductsOnTheList(Product product) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products == product)
                    return true;
            }
        }
        return false;
    }

    // kiểm tra id sản phẩm
    public boolean isIdInProductList(int id) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getID() == id)
                    return true;
            }
        }
        return false;
    }


    // kiểm tra xem tên có nằm trong danh sách chưa?
    public boolean isNameAProductList(String name) {
        if (!productList.isEmpty()) {
            for (Product products : productList) {
                if (products.getName().equalsIgnoreCase(name))
                    return true;
            }
        }
        return false;
    }

    public void addProduct() {
        String name;
        int id;
        double price;
        Scanner input = new Scanner(System.in);

        // nhập name, nếu name nhập vào đã có thì phải nhập lại
        do {
            System.out.println("Product name: ");
            name = input.nextLine();
            if (isNameAProductList(name))
                System.out.println("Product have had in the product list");
        } while (isNameAProductList(name));

        // nhập vào id, nếu id nằm trong list thì phải nhập lại
        do {
            System.out.print("Product id: ");
            id = input.nextInt();
            if (isIdInProductList(id)) {
                System.out.println("Id had in the product list");
            }
        } while (isIdInProductList(id));

        System.out.println("Product price : ");
        price = input.nextDouble();
        Product newProduct = new Product(id, name, price);
        productList.add(newProduct);
    }


    public void setProductListWithId() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list ");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Product id need edit ");
            int id = input.nextInt();

            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getID() == id) {
                        System.out.println("Product have id is " + id + " : " + product);
                        char choice;

                        do {
                            System.out.println("Menu edit Product");
                            System.out.println("1. Edit name product");
                            System.out.println("2. Edit id product");
                            System.out.println("3. Edit price Product");
                            System.out.println("0. Exit");
                            System.out.println("--------------------");
                            Scanner sc = new Scanner(System.in);
                            choice = sc.nextLine().charAt(0);


                            switch (choice) {
                                case '1':
                                    System.out.print("New name: ");
                                    String newName = sc.nextLine();
                                    product.setName(newName);
                                    break;
                                case '2':
                                    System.out.print("New Id : ");
                                    int newID = sc.nextInt();
                                    product.setID(newID);
                                    break;
                                case '3':
                                    System.out.println("New Price : ");
                                    int newPrice = sc.nextInt();
                                    product.setPrice(newPrice);
                                    break;
                                case '0':
                                    menuManager();
                                    break;
                            }
                        } while (choice != 0);
                    }
                }
            }
        }
    }

    public void findProductInProductWithName() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Product need find : ");
            String name = sc.nextLine();
            if (isNameAProductList(name)) {
                for (Product product : productList) {
                    if (product.getName().equalsIgnoreCase(name)) {
                        System.out.println(product);
                    } else {
                        System.out.println("Not  have");
                    }
                }
            }
        }
    }

    public void deleteProductInProductWithId() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list! ");
        } else {
            Scanner input = new Scanner(System.in);
            System.out.println("Product id need remove ");
            int id = input.nextInt();
            if (isIdInProductList(id)) {
                for (Product product : productList) {
                    if (product.getID() == id) {
                        System.out.println("Product remove is : " + product.toString());
                        productList.remove(id);
                    }
                }
            } else {
                System.out.println("Id have not in product list ");
            }
        }
    }

    public void displayProduct() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list");
        } else {
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    public void sortPriceAscending() {
        if (productList.isEmpty()) {
            System.out.println("There are no product in the list! ");
        } else {
            PriceAscComparator priceAscendingComparator = new PriceAscComparator();
            Collections.sort(productList, priceAscendingComparator);
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }

    public void sortPriceDecrease() {
        if (productList.isEmpty()) {
            System.out.println("There are no products in the list !");
        } else {
            PriceDscComparator priceDscComparator = new PriceDscComparator();
            Collections.sort(productList, priceDscComparator);
            int i = 1;
            for (Product product : productList) {
                System.out.println(i + ". " + product.toString());
            }
        }
    }

    public void menuManager() {
        char choice = '?';
        while (choice != '0') {
            System.out.println("Menu product Manager ");
            System.out.println("1. Add Product ");
            System.out.println("2. Edit Product with id ");
            System.out.println("3. find product with name ");
            System.out.println("4. Delete product with id ");
            System.out.println("5. Display product list ");
            System.out.println("6. Sort in ascending order of price");
            System.out.println("7. Sort in decrease order of price");
            System.out.println("0. Exit progame");
            System.out.println("------------------------");
            System.out.println("choice : ");
            Scanner change = new Scanner(System.in);
            choice = change.nextLine().charAt(0);

            switch (choice) {
                case '1':
                    addProduct();
                    break;
                case '2':
                    setProductListWithId();
                    break;
                case '3':
                    findProductInProductWithName();
                    break;
                case '4':
                    deleteProductInProductWithId();
                    break;
                case '5':
                    displayProduct();
                    break;
                case '6':
                    sortPriceAscending();
                    break;
                case '7':
                    sortPriceDecrease();
                    break;
                case '0':
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}
//    public Scanner scanner = new Scanner(System.in);
//
//    public List<Product> listProduct;
//
//    public ProductManager() {
//        listProduct = new ArrayList<>();
//        listProduct.add(new Product(1, "Bò nướng lá lốt", 70000));
//        listProduct.add(new Product(2, "Bắp chiên bơ", 30000));
//        listProduct.add(new Product(3, "Rau muống xào tỏi", 25000));
//        listProduct.add(new Product(4, "Cá lóc um măng", 120000));
//    }
//
//    public void showProducts() {
//        System.out.println("============= showProduct =============");
//        System.out.printf("%-12s%-20s%-30s\n", "ID", "NameProduct", "Price");
//        for (Product product : listProduct) {
//            System.out.printf("%-12s%-20s%-30s\n", product.getId(), product.getTitle(), product.getPrice());
//        }
//        System.out.println("=======================================");
//    }
//
//    public boolean checkID(int id) {
//        for (Product product : listProduct) {
//            if (id == product.getId()) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void addProduct() {
//        int id;
//        do {
//            System.out.println("Nhập id (id phải lớn hơn 0 và không được trùng id): ");
//            id = Integer.parseInt(scanner.nextLine());
//        } while (id <= 0 || checkID(id));
//
//        String name;
//        System.out.println("Nhập tên sản phẩm: ");
//        name = scanner.nextLine();
//        double price;
//        do {
//            System.out.println("Nhập giá (giá phải lớn hơn 0): ");
//            price = Double.parseDouble(scanner.nextLine());
//        } while (price < 0);
//        listProduct.add(new Product(id, name, price));
//        System.out.println("Đã thêm thành công!");
//    }
//
//
//    public void editProductId() {
//        System.out.println("Nhập ID muốn sửa: ");
//        int id = Integer.parseInt(scanner.nextLine());
//
//        if (checkID(id)) {
//            menuEditProductID();
//            for (Product product : listProduct) {
//                if (id == product.getId()) {
//                    int choice = Integer.parseInt(scanner.nextLine());
//                    switch (choice) {
//                        case 1:
//                            System.out.println("Nhập tên mới: ");
//                            String name = scanner.nextLine();
//                            product.setTitle(name);
//                            showProducts();
//                            break;
//                        case 2:
//                            double price;
//                            do {
//                                System.out.println("Nhập giá mới: ");
//                                price = Double.parseDouble(scanner.nextLine());
//                                product.setPrice(price);
//                                while (price <= 0) {
//                                    System.out.println("Giá không hợp lên vui lòng nhập lại!");
//                                    price = Double.parseDouble(scanner.nextLine());
//                                    product.setPrice(price);
//                                }
//                            } while (price <= 0);
//                            showProducts();
//                            break;
//                        case 3:
//                            editProductId();
//                            break;
//                        case 4:
//                            mainMenu();
//                            break;
//                        case 5:
//                            System.exit(5);
//                        default:
//                            System.out.println("Nhập sai, mời chọn lại chức năng!");
//                    }
//                    System.out.println("Sửa thành công!");
//                    break;
//                }
//            }
//        }
//        if (!checkID(id)) {
//            System.out.println("Không có ID này, vui lòng nhập lại: ");
//            editProductId();
//        }
//    }
//
//    public void menuEditProductID() {
//        System.out.println("=========    menuEditProductID    =========");
//        System.out.println("==         1: Sửa tên                    ==");
//        System.out.println("==         2: Sửa giá                    ==");
//        System.out.println("==         3: Chọn lại ID muốn sửa       ==");
//        System.out.println("==         4: Quay lại mainMenu          ==");
//        System.out.println("==         5: Thoát                      ==");
//        System.out.println("===========================================");
//    }
//
//    public void removeProductID() {
//        System.out.println("Nhập ID muốn xóa: ");
//        int id = Integer.parseInt(scanner.nextLine());
//
//        boolean flag = false;
//        for (int i = 0; i < listProduct.size(); i++) {
//            if (id == listProduct.get(i).getId()) {
//                listProduct.remove(i);
//                flag = true;
//                System.out.println("Xóa theo id sản phẩm thành công, danh sách mới là: ");
//                showProducts();
//            }
//        }
//        if (!flag) {
//            System.out.println("Không tìm thấy ID này, vui lòng nhập lại ID: ");
//            removeProductID();
//        }
//    }
//
//    public void searchProductName() {
//        System.out.println("Nhập tên sản phẩm muốn tìm: ");
//        String name = scanner.nextLine();
//
//        List<Product> listSearch = new ArrayList<>();
//
//        for (int i = 0; i < listProduct.size(); i++) {
//            if (listProduct.get(i).getTitle().toLowerCase().contains(name)) {
//                listSearch.add(listProduct.get(i));
//            }
//        }
//        if (listSearch.isEmpty()) {
//            System.out.println("Tên tìm kiếm không có, vui lòng nhập lại!");
//            searchProductName();
//        }
//        System.out.println("Danh sách sản phẩm tìm kiếm được là: ");
//        for (Product product : listSearch) {
//            System.out.println(product.toString());
//        }
//    }
//
//
//    public void ascending() {
//        listProduct.sort(new ProductAscending());
//        showProducts();
//    }
//
//    public void decrease() {
//        listProduct.sort(new ProductDecrease());
//        showProducts();
//    }
//
//    public static void showMenu() {
//        System.out.println("=========     PRODUCTS MENU      =============");
//        System.out.println("==      1. Thêm sản phẩm                    ==");
//        System.out.println("==      2. Sửa thông tin sản phẩm           ==");
//        System.out.println("==      3. Xóa sản phẩm theo ID             ==");
//        System.out.println("==      4. Hiển thị danh sách sản phẩm      ==");
//        System.out.println("==      5. Tìm kiếm sản phẩm theo tên       ==");
//        System.out.println("==      6. Sắp xếp sản phẩm                 ==");
//        System.out.println("==      0. Thoát                            ==");
//        System.out.println("==============================================");
//    }
//
//    public void sortByPrice() {
//        System.out.println("======     SORT BY PRICE     =======");
//        System.out.println("=   1. Sắp xếp sản phẩm tăng dần   =");
//        System.out.println("=   2. Sắp xếp sản phẩm tăng dần   =");
//        System.out.println("=   3. Quay lại MAIN MENU          =");
//        System.out.println("=   4. Thoát                       =");
//        System.out.println("====================================");
//        int choice;
//        do {
//            System.out.print("Chọn chức năng: ");
//            Scanner sc = new Scanner(System.in);
//            choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    ascending();
//                    break;
//                case 2:
//                    decrease();
//                    break;
//                case 3:
//                    mainMenu();
//                    break;
//                case 4:
//                    System.exit(4);
//                    break;
//                default:
//                    System.out.println("Nhập sai, mời nhập lại!");
//            }
//        } while (true);
//    }
//
//    public void mainMenu() {
//        do {
//            showMenu();
//            System.out.print("Chọn chức năng: ");
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    addProduct();
//                    break;
//                case 2:
//                    editProductId();
//                    break;
//                case 3:
//                    removeProductID();
//                    break;
//                case 4:
//                    showProducts();
//                    break;
//                case 5:
//                    searchProductName();
//                    break;
//                case 6:
//                    sortByPrice();
//                    break;
//                case 0:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.print("Nhập sai, mời chọn lại chức năng: ");
//            }
//        } while (true);
//    }
//}