package BusinessLayer;

public class SalesQuery {

   SalesManagement salesManagement;

   public SalesQuery(SalesManagement salesManagement) {
      this.salesManagement = salesManagement;
   }

   public void calculateTheOutputs(){
      System.out.println(calculateMaxNumberOfPurchase().toString());
   }

   public Customer calculateMaxNumberOfPurchase(){
      int max = 0;
      Customer maxCustomer = null;
      for(int i = 0; i<3; i++){
         for (int j = 0; j<40;j++){
            if(salesManagement.getSales(i,j) == null){
               break;
            }
            if (salesManagement.getSales(i,j).getCustomer().getNumberOfPurchases()>max){
               maxCustomer = salesManagement.getSales(i,j).getCustomer();
            }

         }
      }
      return maxCustomer;
   }
}
