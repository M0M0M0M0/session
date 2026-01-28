package main.asm1_26;

public class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String productId, String name, double price, String size) {
        super(productId, price, name);
        this.size = size;
    }

    public ClothingProduct() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getInfo() {
        return getInfo() + "/" + getSize();
    }

    @Override
    public double calculateDiscountedPrice() {
        return getPrice() * 0.85;
    }
}
