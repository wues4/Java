public class Shirt {

    int shirtID = 1394;
    String description = "Nice Shirt ";
    char colorCode = 'B';
    int quantityInStock = 2;
    double price = 19.95;

    void displayInformation(){

        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Shirt color: " + colorCode);
        System.out.println("Quantity in stock: " + quantityInStock);
        System.out.println("Price: " + price);
    }
}
