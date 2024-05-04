package BusinessLayer;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String country;
    private String address;
    private int numberOfPurchases = 0;

    public Customer(String id, String name, String email, String country, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", numberOfPurchases=" + numberOfPurchases +
                '}';
    }

    public void increaseNumberOfPurchases(){
        numberOfPurchases = numberOfPurchases+1;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }
    public int getNumberOfPurchases() {
        return numberOfPurchases;
    }
}
