package BusinessLayer;

public class Product {
    private String id;
    private String title;
    private Double rate;
    private int numberOfReviews;
    private Double price;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", rate=" + rate +
                ", numberOfReviews=" + numberOfReviews +
                ", price=" + price +
                '}';
    }

    public Product(String id, String title, Double rate, int numberOfReviews, Double price) {
        this.id = id;
        this.title = title;
        this.rate = rate;
        this.numberOfReviews = numberOfReviews;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getRate() {
        return rate;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public Double getPrice() {
        return price;
    }


}
