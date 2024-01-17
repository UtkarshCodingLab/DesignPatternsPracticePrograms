package com.abstractfactorydesignpatternexample;

public class ManagerFactory extends AbstractFactory{
    @Override
    public Employee createnewEmployee(String empType) {
        if(empType.trim().equalsIgnoreCase("MANAGER"))
        {
            return new Manager();
        }
        else {
            return null;
        }
    }
}
