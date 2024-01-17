package com.abstractfactorydesignpatternexample;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String description() {
        return "I am a Web Developer";
    }
}
