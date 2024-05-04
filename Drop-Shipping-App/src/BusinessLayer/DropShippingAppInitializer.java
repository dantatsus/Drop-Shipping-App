package BusinessLayer;

import FileIO.FileReader;

import javax.xml.xpath.XPath;
import java.util.StringTokenizer;

public class DropShippingAppInitializer {

    Customer[] customers;
    Sales[] sales;

    SalesManagement salesManagement;

    public void initializeTheApp(){

        customers = setCustomerArray();

        String[] pathsToProductsFiles = {"src/S1_Products.csv","src/S2_Products.csv","src/S3_Products.csv"};
        String[] pathsToSalesFiles = {"src/S1_Sales.csv", "src/S2_Sales.csv", "src/S3_Sales.csv"};

        //Create 3 different suppliers
        Supplier[] suppliers = new Supplier[3];

        //Create a new supplier object and fill it with Product array, and then put that supplier to the suppliers array.
        for(int i = 0; i< pathsToProductsFiles.length; i++){
            suppliers[i] = new Supplier(setProductArray(pathsToProductsFiles[i]));
        }

        SalesManagement salesManagement = new SalesManagement();

        //Call the method that brings the sales and put them in an array
        for(int i = 0; i< pathsToSalesFiles.length; i++){
            sales = setSalesArray(pathsToSalesFiles[i],suppliers[i].getProducts());
            for(int index = 0; index < sales.length; index++){
                //Put sales in salesManagement Class
                salesManagement.setSales(sales[index],i,index);
                sales[index].getCustomer().increaseNumberOfPurchases();
                //System.out.println(salesManagement.getSales(i,index).getCustomer().toString());
            }
        }

        SalesQuery salesQuery = new SalesQuery(salesManagement);
        salesQuery.calculateTheOutputs();
    }



    private Customer[] setCustomerArray(){
        //Put customers to customersFromFile array
        FileReader file = new FileReader();
        String[] customersFromFile = file.getDatasFromFile("src/Customers.csv");

        //The array that we are going to return
        Customer[] customers = new Customer[customersFromFile.length];

        //Split the Strings from customersFromFile one by one and create a new customer object each time
        for (int index = 1; index< customersFromFile.length; index++) {
            StringTokenizer line = new StringTokenizer(customersFromFile[index],",");
            customers[index - 1] = new Customer(line.nextToken(), line.nextToken(), line.nextToken(), line.nextToken(), line.nextToken());
        }
        return customers;
    }

    private Product[] setProductArray(String path){
        //Put products to productsFromFile array
        FileReader file = new FileReader();
        String[] productsFromFile = file.getDatasFromFile(path);

        //The array that we are going to return
        Product[] products = new Product[productsFromFile.length];

        //Split the Strings from producstFromFile one by one and create a new product object each time
        for (int index = 1; index< productsFromFile.length; index++) {
            StringTokenizer line = new StringTokenizer(productsFromFile[index],",");
            products[index - 1] = new Product(line.nextToken(), line.nextToken(), Double.parseDouble(line.nextToken()), Integer.parseInt(line.nextToken()), Double.parseDouble(line.nextToken()));
        }

        return products;
    }

    private Sales[] setSalesArray(String path, Product[] products) {
        //Put sales to salesFromFile array
        FileReader file = new FileReader();
        String[] salesFromFile = file.getDatasFromFile(path);

        //The array that we are going to return
        sales = new Sales[salesFromFile.length - 1];

        //Split the Strings from salesFromFile one by one and create a new sales object each time
        for (int index = 1; index< salesFromFile.length; index++) {
            StringTokenizer line = new StringTokenizer(salesFromFile[index],",");
            sales[index - 1] = new Sales(line.nextToken(), findCustomerById(line.nextToken()), findProductById(line.nextToken(),products), line.nextToken());
        }
        return sales;
    }

    private Customer findCustomerById(String id) {
        Customer customer;

        //If the ID's are equal, then return that object
        for(int index =0; index < customers.length; index++){
            if (customers[index].getId().equals(id)){
                customer = customers[index];
                return customer;
            }
        }

        return null;
    }

    private Product findProductById(String id, Product[] products){
        Product product;

        //If the ID's are equal, then return that object
        for(int index = 0; index <products.length;index++ ) {
            if (products[index].getId().equals(id)) {
                product = products[index];
                return product;
            }
        }
        return null;
    }

}
