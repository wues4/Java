import java.util.ArrayList;

public class NamesListTwo {
    public ArrayList listOfNames;
    
    public void setList(){
        listOfNames = new ArrayList();
        listOfNames.add("Joe Smith");
        listOfNames.add("Mary Palmer");
        listOfNames.add("Jose Gonzalez");
        listOfNames.add("Linda Baker");
        System.out.println("Size of ArrayList is: " + listOfNames.size());
    }

    public void displayNames(){
        System.out.println("Names in the ArrayList: ");
        for (Object name : listOfNames) {
            System.out.println(name);
        }
    }
}
