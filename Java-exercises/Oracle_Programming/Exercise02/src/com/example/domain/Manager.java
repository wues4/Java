package com.example.domain;

public class Manager extends Employee {
    private String deptName;
    private Employee[] staff;
    private int employeeCount = 0;


    public Manager(int empId, String name, String ssn, double salary, String deptName){
        super(empId, name, ssn, salary);
        this.deptName = deptName;
        this.staff = new Employee[20];
    }

    public String getDeptName() {
        return deptName;
    }

    public int findEmployee(Employee emp){
        int result = -1;
        for (int i = 0; i<employeeCount; i++)
            if (emp.equals(staff[i])) {
                result = 1;
            }
        return result;
    }

    public boolean addEmployee(Employee emp){
        if (findEmployee(emp) != -1)
            return false;
        staff[employeeCount] = emp;
        employeeCount++;
        return true;
    }

    public boolean removeEmployee(Employee emp){
        boolean ifEmpPartOfStaff = false;
        Employee[] newEmployeeStaff = new Employee[20];
        int newEmployeeCount = 0;
        for (int i = 0; i<employeeCount;i++){
            if (staff[i].getEmpId() == emp.getEmpId()) {
                ifEmpPartOfStaff = true;
            } else {
                newEmployeeStaff[newEmployeeCount] = staff[i];
                newEmployeeCount++;
            }
        }
        if (ifEmpPartOfStaff){
            staff=newEmployeeStaff;
            employeeCount=newEmployeeCount;
        }
        return ifEmpPartOfStaff;
    }

    public void printStaffDetails(){
        System.out.println("Staff of " + this.getName() + ": ");
        for (int i = 0; i<employeeCount;i++)
            System.out.println("Employee ID: " + staff[i].getEmpId() + ", " + "Name: " + staff[i].getName());
    }
}
