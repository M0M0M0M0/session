package main.asm1_26;

public class ElectronicProduct extends Product {
    private Integer warrantyMonths;

    public ElectronicProduct() {

    }

    public ElectronicProduct(String productId, String name, double price, int warrantyMonths) {
        super(productId, price, name);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void getInfo() {
        System.out.println(getProductId() + "/" + getName() + "/" + getPrice() + "/" + getWarrantyMonths());
    }

    @Override
    public double calculateDiscountedPrice() {
        if (getPrice() > 10000000) return getPrice() * 0.9;
        return getPrice();
    }
}
