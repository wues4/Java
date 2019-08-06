import java.util.ArrayList;

class Manager extends Employee{

    private ArrayList<Employee> employeeList = new ArrayList<>();
    Employee emp;

    void setEmployee(Employee e){
        employeeList.add(e);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Manager has the following employees: ");
        for (Object obj: employeeList){
            emp = (Employee)obj;
            System.out.println("\t" + emp.getName());
        }
    }
}
