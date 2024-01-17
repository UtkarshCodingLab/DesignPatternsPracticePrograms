package com.abstractfactorydesignpatternexample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What Do you Want");
        System.out.println("Enter Manager for Manager");
        System.out.println("Enter Andriod Developer for Andriod Developer");
        System.out.println("Enter Web Developer for Web Developer");
        String choice = sc.nextLine();
        AbstractFactory abstractFactory = EmployeeFactory.getEmployee(choice);
        Employee employee1 = abstractFactory.createnewEmployee(choice);
        System.out.println("Description: "+employee1.description());
        System.out.println("Salary: "+employee1.salary());

    }
}
