package practice_activities.demo.model;

import practice_activities.demo.productsort.PriceASC;
import practice_activities.demo.view.ProductView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ProductManager {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> products = new ArrayList<>();

    public void setProducts(ArrayList<Product> products) {
        ProductManager.products = products;
    }

    public ProductManager() {
    }

    public ProductManager(ArrayList products) {
        this.products = products;
    }

    public static void getProduct() {
        Product product1 = new Product(1, "Ghế sofa", 5, 1000000);
        Product product2 = new Product(2, "Tủ áo quần", 8, 1200000);
        Product product3 = new Product(3, "Bàn trang điểm", 4, 950000);
        Product product4 = new Product(4, "Bếp Từ", 7, 3200000);
        Product product5 = new Product(5, "Ghế tình yêu", 3, 30000);
        Product product6 = new Product(6, "Tủ lạnh", 5, 95000);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
    }

    public static boolean isEmpty() {
        return products.size() == 0;
    }

    public static void addProduct() {
        Product product = ProductView.enterProductInfo();
        if (products.contains(product)) {
            System.out.println("Sản phẩm đã tồn tại!");
        } else {
            products.add(product);
        }
    }

    public static int findIndexById(long id) {
        int index = 0, i;
        for (i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        if (i == products.size()) {
            System.out.println("Không tồn tại sản phẩm có id là: " + id);
            return -1;
        }
        return index;
    }

    public static void editProduct() {
        System.out.print("Nhập id sản phẩm muốn sửa: ");
        long id = Long.parseLong(scanner.nextLine());
        int index = findIndexById(id);
        editInfoProduct(id, index);
    }

    public static void editInfoProduct(long id, int index) {
        System.out.println("Nhập thông cần chỉnh sửa!");
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số lượng sản phẩm: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name, amount, price);
        products.set(index, product);
//        products.get(index).setId(id);
    }

    public static Product searchProduct() {
        System.out.print("Nhập id sản phẩm muốn tìm: ");
        long id = Long.parseLong(scanner.nextLine());
        sortProduct();
        int index = findIndexById(id);
        int low = 0, high = products.size() - 1;
        return binarySearch(products, low, high, products.get(index));
    }

    public static Product binarySearch(ArrayList<Product> products, int low, int high, Product product) {
        int mid = (low + high) / 2;
        if (products.get(mid).equals(product)) {
            return products.get(mid);
        }

        if (products.get(mid).compareTo(product) > 0) {
            return binarySearch(products, low, mid - 1, product);
        }

        if (products.get(mid).compareTo(product) < 0) {
            return binarySearch(products, mid + 1, high, product);
        }

        return null;
    }

    public static void removeProduct() {
        System.out.print("Nhập id sản phẩm muốn xoá: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.println("Sản phẩm có id là: " + id + " đã được xoá khỏi danh sách!");
        int index = findIndexById(id);
        products.remove(index);
    }

    public static void showProduct() {
        if (isEmpty()) {
            System.out.println("Danh sách sản phẩm trống!");
        } else {
            System.out.println("⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞⋞ DANH SÁCH SẢN PHẨM ⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟⋟");
            System.out.printf("*        %-10s %-25s %-20s %-10s *\n", "ID", "Tên sản phẩm", "Số lượng", "Giá");

            for (int i = 0; i < products.size(); i++) {
                System.out.printf("*        %-6s %-31s %-16s %-12s *\n", products.get(i).getId(), products.get(i).getName(), products.get(i).getAmount(), products.get(i).getPrice());
            }

            System.out.println("⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐ ⋐  ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ⋑ ");
        }
    }

    public static ArrayList<Product> sortProduct() {
        Collections.sort(products);
        return products;
    }

    public void sortPriceAsc() {
        if (!products.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong danh sách !");
        } else {
            PriceASC priceASC = new PriceASC();
            Collections.sort(products, priceASC);
            int i = 1;
            for (Product product : products) {
                System.out.println(i + ". " + product.toString());
                i++;
            }
        }
    }
}