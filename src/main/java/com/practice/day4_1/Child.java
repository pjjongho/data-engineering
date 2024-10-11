// day4 package day4_1로 이동

package com.practice.day4_1;

import com.practice.day4.AccessModifierTest;

public class Child extends AccessModifierTest{
    public void call() {
        this.messageOutside();
        this.messageProtected();
        // this.messageDefault();
        // this.messageInside(); -> compile error
    }

    public static void main(String[] args) {
        Child anomymous = new Child();
        anomymous.call();
    }
}
