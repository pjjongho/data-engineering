package com.practice.day5_CollectionStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(10);
        System.out.println(list);

        Collections.sort(list); // List 안의 integer가 오름차순으로 변경
        System.out.println(list);

        System.out.println(list.size());

        list.remove(4); // List 안의 5번째 값을 삭제
        System.out.println(list);

        int[] intArr = {1,4,5,11,10};
        System.out.println(intArr[4]);

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for (int cur: list){
            System.out.println(cur);
        }
    }
}
