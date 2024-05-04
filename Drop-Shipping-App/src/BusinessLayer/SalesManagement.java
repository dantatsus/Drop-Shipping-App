package BusinessLayer;

public class SalesManagement {
    public static Sales[][] sales;

    public Sales getSales(int row, int col) {
        return sales[row][col];
    }

    public void setSales(Sales sales, int row, int col) {
        this.sales[row][col] = sales;
    }

    public int getSalesLength(){
        return sales.length;
    }
    public SalesManagement() {
        this.sales = new Sales[3][40];
    }

}
