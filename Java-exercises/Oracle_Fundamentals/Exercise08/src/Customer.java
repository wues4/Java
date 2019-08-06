public class Customer {

    int customerID;
    String name="-name required-";
    String address="-address required-";
    String phoneNumber="-phone required-";
    String eMail="-email optional-";

    void setCustomerInfo(int customerID, String name, String address, String phoneNumber){
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    void setCustomerInfo(int customerID, String name, String address, String phoneNumber, String eMail){
        setCustomerInfo(customerID, name, address, phoneNumber);
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
