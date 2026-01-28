package main.asm1_26;

public class FoodProduct extends Product {
    private Integer expiryDay;

    public FoodProduct(String productId, String name, double price, int expiryDay) {
        super(productId, price, name);
        this.expiryDay = expiryDay;
    }

    public FoodProduct() {
    }

    public int getExpiryDay() {
        return expiryDay;
    }

    public void setExpiryDay(int expiryDay) {
        this.expiryDay = expiryDay;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "/" + getExpiryDay();
    }

    @Override
    public double calculateDiscountedPrice() {
        if (getExpiryDay() <= 3) return getPrice() * 0.7;
        else if (getExpiryDay() <= 7) {
            return getPrice() * 0.9;
        }
        return getPrice();
    }
}
