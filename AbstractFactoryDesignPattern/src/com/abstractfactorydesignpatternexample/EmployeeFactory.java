package com.abstractfactorydesignpatternexample;

public class EmployeeFactory {
    public static AbstractFactory getEmployee(String empType) {
        if(empType.trim().equalsIgnoreCase("ANDRIOD DEVELOPER"))
        {
            return new AndriodDevFactory();
        }
        else if(empType.trim().equalsIgnoreCase("MANAGER"))
        {
            return new ManagerFactory();
        }
        else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER"))
        {
            return new WebDevFactory();
        }
        else {
            return null;
        }
    }
}
