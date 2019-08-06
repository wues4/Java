public class PersonTwo {

    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();

    public void displayPersonInfo(){

        name.append("Bogumił");
        name.append(" ");
        name.append("Wytrych");
        System.out.println("Name: " + name.toString());
        System.out.println("Name capacity: " + name.capacity());

        phoneNumber.append("877895263");
        phoneNumber.insert(3,"-");
        phoneNumber.insert(7,"-");
        System.out.println("Phone number: " + phoneNumber.toString());

        System.out.println("First name: " + name.substring(0, 8));
        System.out.println("Last name: " + name.substring(8));
    }
}