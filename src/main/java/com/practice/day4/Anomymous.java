package com.practice.day4;

public class Anomymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        accessModifierTest.messageDefault();
        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
        // accessModifierTest.messageinside(); -> compile error
    }

    public static void main(String[] args) {
        Anomymous anomymous = new Anomymous();
        anomymous.call();
    }
}
