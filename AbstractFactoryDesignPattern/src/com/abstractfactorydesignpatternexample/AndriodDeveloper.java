package com.abstractfactorydesignpatternexample;

public class AndriodDeveloper implements Employee {
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String description() {
        return "I am a Andriod Developer";
    }
}
