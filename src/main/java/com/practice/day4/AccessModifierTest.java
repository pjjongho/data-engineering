package com.practice.day4;

public class AccessModifierTest {

    private void messageInside() { // 같은 클래스 내에서만 접근이 가능함.
        System.out.println("This is private modifier");
    }

    void messageDefault() { // 같은 패키지 내에서만 접근 가능함
        messageInside();
        System.out.println("This is default(package-private) modifier");
    }

    protected void messageProtected() { // 같은 패키지 내에서, 그리고 다른 패키지의 자식 클래스에서 접근 가능함.
        messageInside();
        System.out.println("This is protected modifier");
    }

    public void messageOutside() { // 접근 제한이 없음.
        messageInside();
        System.out.println("This is public modifier");
    }
}
