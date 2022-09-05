package practice_activities.demo.model;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private long id;
    private String name;
    private int amount;
    private int price;

    public Product(){
    }

    public Product(long id,String name, int amount, int price) {
//        this.id = (long) (Math.floor((Math.random()) * ((1000 - 100) + 1)) + 100);
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if(price - o.price == 0){
            if(amount - o.amount == 0){
                return name.compareTo(o.name);
            }else{
                return amount - o.amount;
            }
        }
        return price - o.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && amount == product.amount && price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount, price);
    }
}