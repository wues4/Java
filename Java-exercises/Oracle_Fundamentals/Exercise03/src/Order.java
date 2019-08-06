public class Order {

    long orderValue = 0L;
    int itemQuantity = 10_000_000;
    int itemPrice = 950_900;

    public void calculateTotal(){

        orderValue = (long)itemQuantity*itemPrice;
        System.out.println("Total: " + orderValue);
    }
}
