public class CustomerTest {
    public static void main(String[] args) {

        Customer cust1 = new Customer();
        cust1.customerID = 1;
        cust1.name = "Janina";
        cust1.emailAddress = "Janina1@customer.com";
        cust1.displayCustomerInfo();

        Customer cust2 = new Customer();
        cust2.customerID = 2;
        cust2.name = "Bogdan";
        cust2.emailAddress = "Bogdan4@customer.com";
        cust2.displayCustomerInfo();
    }
}