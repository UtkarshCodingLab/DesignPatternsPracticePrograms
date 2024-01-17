package com.singletonpatternexample;

public class SingletonClassEarlyInitialization {

    private static SingletonClassEarlyInitialization singletonClassEarlyInitialization = new SingletonClassEarlyInitialization();
    private SingletonClassEarlyInitialization() {
    }

    public static SingletonClassEarlyInitialization createObjectsUsingMethods(){
        return singletonClassEarlyInitialization;
    }
}
