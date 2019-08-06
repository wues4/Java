import java.util.ArrayList;

public class NamesList {

    public ArrayList listOfNames;

    public void setList(){
        listOfNames = new ArrayList();
        listOfNames.add("Bogdan Smoleń");
        listOfNames.add("Gienia Żegnaj");
        listOfNames.add("Zdzisek Lisek");
        listOfNames.add("Janina Gadzina");

        System.out.println("Names list: " + listOfNames);
        System.out.print("Size of your list: " + listOfNames.size());
        System.out.println();
    }

    public void manipulateList(){
        listOfNames.remove("Bogdan Smoleń");
        System.out.println("Names list after removing element: " + listOfNames);
        System.out.println("Size of your list: " + listOfNames.size());

        listOfNames.add(3, "Bogdan Smoleń");
        System.out.println("Names list after adding removed element: " + listOfNames);
        System.out.println("Size of your list: " + listOfNames.size());
    }
}
