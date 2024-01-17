package com.abstractfactorydesignpatternexample;

public class AndriodDevFactory extends AbstractFactory{
    @Override
    public Employee createnewEmployee(String empType) {
        if(empType.trim().equalsIgnoreCase("ANDRIOD DEVELOPER"))
        {
            return new AndriodDeveloper();
        }
        else {
            return null;
        }
    }
}
