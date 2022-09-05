package java_collection_framework.product_arraylist;

public class Product {
    private int ID ;
    private String Name ;
    private double price;

    public Product(int ID, String name, double price) {
        this.ID = ID;
        this.Name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Product{" +
                "id=" + ID +
                ", name='" + Name + '\'' +
                ", price=" + price +
                '}';

    }
}