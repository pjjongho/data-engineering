package com.practice.day6;


import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        java.util.Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(5);
        System.out.println(queue);
        System.out.println("Queue size: "+queue.size());
        System.out.println("Queue first element: "+queue.peek()); // stack과 달리 Queue는 list의 첫번째 element를 가져옴
        System.out.println(queue.poll());
        System.out.println("Queue size: "+queue.size());

        queue.offer(2);
        queue.offer(4);
        queue.offer(8);
        System.out.println(queue);


        int lastSizeOfQueue = queue.size();
        for (int i=0; i<lastSizeOfQueue; i++){
            queue.poll();
        }
        System.out.println("isEmpty: "+ queue.isEmpty());
    }
}
