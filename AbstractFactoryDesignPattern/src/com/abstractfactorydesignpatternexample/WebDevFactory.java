package com.abstractfactorydesignpatternexample;

public class WebDevFactory extends AbstractFactory{
    @Override
    public Employee createnewEmployee(String empType) {
        if(empType.trim().equalsIgnoreCase("WEB DEVELOPER"))
        {
            return new WebDeveloper();
        }
        else {
            return null;
        }
    }
}
