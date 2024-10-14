package com.practice.day6;

public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>();
        arrayDeque.addFirst(1);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(2);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(3);
        System.out.println(arrayDeque);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque);

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        arrayDeque.offer(10);
        System.out.println("offer +10: "+arrayDeque);

        arrayDeque.offerLast(11);
        System.out.println("offerLast +11: "+arrayDeque);

        arrayDeque.offerFirst(5);
        System.out.println("offerFirst +5: "+arrayDeque);

        arrayDeque.push(6);
        System.out.println("push(6): "+arrayDeque);

        arrayDeque.pop();
        System.out.println("pop : "+ arrayDeque);

        arrayDeque.poll();
        System.out.println("poll : "+arrayDeque);

        arrayDeque.pollLast();
        System.out.println("polllast : "+arrayDeque);

        arrayDeque.remove(0);
        System.out.println("remove(0) : "+arrayDeque);
    }
}
