public class OrderTest {

    public static void main(String[] args) {
        double totalCost;
        Order order = new Order();

        Shirt shirt1 = new Shirt();
        shirt1.price = 9.99;
        order.addShirt(shirt1);

        Shirt shirt2 = new Shirt();
        shirt2.price = 19.99;
        order.addShirt(shirt2);

        Shirt shirt3 = new Shirt();
        shirt3.price = 4.99;
        order.addShirt(shirt3);
        shirt3.display();

        order.removeShirt(shirt2);

        totalCost = order.totalPrice;
        System.out.println();
        System.out.println("Total cost of your order is: " + totalCost);
    }
}
