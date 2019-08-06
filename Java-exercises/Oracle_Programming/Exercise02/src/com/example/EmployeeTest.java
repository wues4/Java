package com.example;

import com.example.domain.*;

import java.text.NumberFormat;

public class EmployeeTest {

    public static void main(String[] args) {
        Engineer eng1 = new Engineer(101, "Jane Smith", "012-345-678", 120_520.55);
        Engineer eng2 = new Engineer(105, "Bob Snob", "086-987-321", 100_820.20);


        Manager man = new Manager(207, "Barbara Johnson", "054-12-3456", 109_501.35, "US Marketing");
        Admin adm = new Admin(304, "Bill Monroe", "108-23-6509", 75_002.34);
        Director dir = new Director(12, "Susan Wheeler", "099-45-2340", 120_45.36, "Global Marketing", 1_000_000.00);

        printEmployee(eng1);
        printEmployee(eng2);
        printEmployee(man);
        printEmployee(adm);
        printEmployee(dir);

        System.out.println(" ### Testing - raiseSalary, setName ### ");
        adm.setName("Bogdan Smoleń");
        adm.raiseSalary(8000);
        printEmployee(adm);

        // Test addEmployee manager method
        System.out.println("Add Employee 1: " + man.addEmployee(eng1));
        System.out.println("Add Employee 2: " + man.addEmployee(eng2));
        // Test removeEmployee manager method
        System.out.println("Remove Employee 1: " + man.removeEmployee(eng1));
        // Test findEmployee manager method
        System.out.println("Find Employee: " + man.findEmployee(eng1));
        // Add another employees
        man.addEmployee(adm);
        man.addEmployee(eng1);
        // print managaer staff
        man.printStaffDetails();
    }

    private static void printEmployee(Employee emp){
        System.out.println("Employee ID:            " + emp.getEmpId());
        System.out.println("Employee name:          " + emp.getName());
        System.out.println("Employee SSN:           " + emp.getSsn());
        System.out.println("Employee salary:        " + NumberFormat.getCurrencyInstance().format(emp.getSalary()));
        System.out.println();
    }

    private static void printEmployee(Manager emp){
        System.out.println("Employee ID:            " + emp.getEmpId());
        System.out.println("Employee name:          " + emp.getName());
        System.out.println("Employee SSN:           " + emp.getSsn());
        System.out.println("Employee salary:        " + NumberFormat.getCurrencyInstance().format(emp.getSalary()));
        System.out.println("Employee Department:    " + emp.getDeptName());
        System.out.println();
    }

    private static void printEmployee(Director emp){
        System.out.println("Employee ID:            " + emp.getEmpId());
        System.out.println("Employee name:          " + emp.getName());
        System.out.println("Employee SSN:           " + emp.getSsn());
        System.out.println("Employee salary:        " + NumberFormat.getCurrencyInstance().format(emp.getSalary()));
        System.out.println("Employee Department:    " + emp.getDeptName());
        System.out.println("Company  Budget:        " + NumberFormat.getCurrencyInstance().format(emp.getBudget()));
        System.out.println();
    }
}