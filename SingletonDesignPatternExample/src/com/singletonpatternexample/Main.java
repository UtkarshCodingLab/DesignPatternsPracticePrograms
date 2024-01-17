package com.singletonpatternexample;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       SingletonClass s1 = SingletonClass.newObjectusingMethod();
        System.out.println(s1.hashCode());
        SingletonClass s2 = SingletonClass.newObjectusingMethod();
        System.out.println(s2.hashCode());

        SingletonClassEarlyInitialization se1 = SingletonClassEarlyInitialization.createObjectsUsingMethods();
        System.out.println(se1.hashCode());
        SingletonClassEarlyInitialization se2 = SingletonClassEarlyInitialization.createObjectsUsingMethods();
        System.out.println(se2.hashCode());
        }
    }
