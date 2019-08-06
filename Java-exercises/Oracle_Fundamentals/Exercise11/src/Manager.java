import java.util.ArrayList;

public class Manager extends Employee {
    public ArrayList employeeList = new ArrayList();
    
    public void setEmployee(Employee emp){
        employeeList.add(emp);
    }
    
    public ArrayList getEmployees(){
        return employeeList;
    }
    
    public void print(){
        Employee emp;
        super.print();
        System.out.println("Manager has the following employees: ");
        for(Object obj : employeeList){
            // Cast the object as an Employee
            emp = (Employee)obj;
            // Print the name, indented by a tab
            System.out.println("\t" + emp.getName());
        }
    }
}
