package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Jane Smith");
        emp.setSecurityNumber("012-34-567");
        emp.setSalary(120_345.27);

        System.out.println("Employee ID:        " + emp.getId());
        System.out.println("Employee name:      " + emp.getName());
        System.out.println("Employee SSN:       " + emp.getSecurityNumber());
        System.out.println("Employee salary:    " + emp.getSalary());
    }
}
