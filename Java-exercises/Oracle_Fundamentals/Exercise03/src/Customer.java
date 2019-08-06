public class Customer {

    int customerID = 355;
    char status = 'N';
    double totalPurchases = 5.90;

    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + customerID);
        System.out.println("Status: " + status);
        System.out.println("Total purchases: " + totalPurchases);
    }
}
