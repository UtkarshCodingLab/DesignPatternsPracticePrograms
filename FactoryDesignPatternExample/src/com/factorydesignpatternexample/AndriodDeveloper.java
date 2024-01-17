package com.factorydesignpatternexample;

public class AndriodDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Andriod Developer Salary");
        return 50000;
    }
}
