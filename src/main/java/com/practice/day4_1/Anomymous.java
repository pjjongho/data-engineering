// day4 package day4_1로 이동

package com.practice.day4_1;

import com.practice.day4.AccessModifierTest;

public class Anomymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        // accessModifierTest.messageDefault();
        // accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
        // accessModifierTest.messageinside(); -> compile error
    }

    public static void main(String[] args) {
        Anomymous anomymous = new Anomymous();
        anomymous.call();
    }
}
