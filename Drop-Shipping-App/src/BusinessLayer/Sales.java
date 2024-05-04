package BusinessLayer;

import java.util.Date;

public class Sales {
    private String id;
    private Customer customer;
    private Product product;
    private String salesDate;
    private Double salesPrice;

    public Sales(String id, Customer customer, Product product, String salesDate) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.salesDate = salesDate;
        //calculate the salesPrice through formula
        this.salesPrice =this.product.getPrice() + (this.product.getRate()/(5.0) *( 100) * this.product.getNumberOfReviews());

    }

    @Override
    public String toString() {
        return "Sales{" +
                "id='" + id + '\'' +
                ", customer=" + customer.getName() +
                ", product=" + product.getTitle() +
                ", salesDate='" + salesDate + '\'' +
                ", salesPrice=" + salesPrice +
                '}';
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }
}
