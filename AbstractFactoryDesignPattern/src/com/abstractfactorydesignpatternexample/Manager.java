package com.abstractfactorydesignpatternexample;

public class Manager implements Employee {
    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String description() {
        return "I am a Manager";
    }
}
