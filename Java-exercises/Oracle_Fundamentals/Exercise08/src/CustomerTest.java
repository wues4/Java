public class CustomerTest {

  public static void main (String args[]) {
    Customer customer1 = new Customer();
    Customer customer2 = new Customer();

    customer1.setCustomerInfo(1, "Bogdan", "Poland, Warsaw 12-323, Urocza 7", "753-159-456");
    customer2.setCustomerInfo(2, "Gienia", "Poland, Gdansk 89-332, Cicha 1", "123-123-123", "gienia@gmail.com");

    System.out.println(customer1.toString());
    System.out.println(customer2.toString());
  } 
}
