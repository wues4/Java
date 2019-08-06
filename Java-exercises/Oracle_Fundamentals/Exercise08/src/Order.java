public class Order {

  double totalPrice = 0.0; // Default price for order

  public double addShirt (Shirt shirt) {
    totalPrice = totalPrice + shirt.price;
    return totalPrice;
  }

  public void removeShirt (Shirt shirt){
    totalPrice = totalPrice - shirt.price;
  }

} // end of class
