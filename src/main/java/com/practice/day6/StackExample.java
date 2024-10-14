package com.practice.day6;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);
        System.out.println((stack.peek())); // stack 에 쌓인 list의 제일 마지막(가장 최근) element
        System.out.println(stack.size()); // 쌓인 stack의 갯수
        System.out.println(stack.pop());
        System.out.println(stack.peek()); // 이전 실행이 pop으로 7을 꺼냄으로 그 다음 제일 마지막 element인 5가 출력
        System.out.println(stack.contains(1)); // stack안에 1의 존재 여부 => True
        System.out.println(stack.contains(7)); // stack안에 7의 존재 여부
                                               // -> False : 이전 실행에서 pop 을 통해 빼냈기 때문에 7은 존재하지 않음

        int lastSizeOfStack = stack.size();
        for (int i=0; i< lastSizeOfStack; i++){
            stack.pop();

        }
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println(stack);
    }
}
