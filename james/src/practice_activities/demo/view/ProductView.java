package practice_activities.demo.view;

import practice_activities.demo.model.Product;
import practice_activities.demo.model.ProductManager;

import java.util.Scanner;

public class ProductView {
    private static Scanner scanner = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("❤❤❤❤❤❤❤Product-Manager❤❤❤❤❤❤❤❤");
        System.out.println("⌚        1. Thêm sản phẩm.           ⌚");
        System.out.println("⌚        2. Sửa sản phẩm.            ⌚");
        System.out.println("⌚        3. Xoá sản phẩm.            ⌚");
        System.out.println("⌚        4. Danh sách sản phẩm.      ⌚");
        System.out.println("⌚        5. Tìm kiếm sản phẩm.       ⌚");
        System.out.println("⌚        6. Sắp xếp sản phẩm tăng dần⌚");
        System.out.println("⌚        7.Sắp xếp sản phẩm tăng dần ⌚");
        System.out.println("⌚        0. Thoát.                   ⌚");
        System.out.println("❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤❤");
    }

    public static void run() {
        int choice;
        ProductManager.getProduct();
        do {
            showMenu();
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    ProductManager.addProduct();
                    break;
                case 2:
                    ProductManager.editProduct();
                    break;
                case 3:
                    ProductManager.removeProduct();
                    break;
                case 4:
                    ProductManager.showProduct();
                    break;
                case 5:
                    System.out.println(ProductManager.searchProduct());;
                    break;
                case 6:
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static Product enterProductInfo(){
        System.out.println("Nhập thông tin sản phẩm muốn thêm!");
        System.out.print("Nhập id: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập số lượng sản phẩm: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Sản phẩm đã được thêm vào danh sách!");
        Product product = new Product(id,name,amount,price);

        return product;
    }
}