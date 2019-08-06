public class Customer {

  public int customerID = 0;
  public String name = "-name required-";
  public String emailAddress = "-email required-";

  public void displayCustomerInfo() {
    System.out.println("********Customer Information********");
    System.out.println("Customer ID: " + customerID);
    System.out.println("Name: " + name);
    System.out.println("Email: " + emailAddress);
    System.out.println("************************************");
  }
}