package main.asm1_26;

public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, double price, String name) {
        this.productId = productId;
        this.price = price;
        this.name = name;
    }

    public Product() {
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return getProductId() + "/" + getName() + "/" + getPrice();
    }

    public double calculateDiscountedPrice() {
        return price;
    }
}
