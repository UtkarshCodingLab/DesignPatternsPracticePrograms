package com.factorydesignpatternexample;

public class EmployeeFactory {

    public static Employee getEmployee(String empType)
    {
        if(empType.trim().equalsIgnoreCase("ANDRIOD DEVELOPER"))
        {
            return new AndriodDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER"))
        {
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}
