package com.singletonpatternexample;

public class SingletonClass {

    private static SingletonClass singletonClass;
    private SingletonClass() {
    }

    public static SingletonClass newObjectusingMethod() {

        synchronized (SingletonClass.class) {
            if (singletonClass == null) {
                singletonClass = new SingletonClass();
            }
        }
        return singletonClass;
    }


}
