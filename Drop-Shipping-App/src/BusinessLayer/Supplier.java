package BusinessLayer;

public class Supplier {
    private Product[] products;
    public Supplier(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }


}
