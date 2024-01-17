package com.factorydesignpatternexample;

public class Main {
    public static void main(String[] args)
    {
        Employee employee = EmployeeFactory.getEmployee("ANDRIOD DEVELOPER");
        int employeeSalary = employee.salary();
        System.out.println(employeeSalary);

        Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int employeeSalary1 = employee1.salary();
        System.out.println(employeeSalary1);
    }
}
