package com.practice.day5_CollectionStructure;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String>map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "berry");
        map.put(3, "Cherry");
        map.put(100, "pineapple");
        System.out.println(map);

        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("first", "apple");
        stringStringMap.put("second", "berry");

        stringStringMap.putIfAbsent("second", "pineapple"); //putIfAbsent는 위에 put에 선언한게 있을 경우 mapping하지 않음
        stringStringMap.putIfAbsent("third","pineapple");
        System.out.println(stringStringMap);

        if(stringStringMap.containsKey("first")){
            System.out.println("exist!: " + stringStringMap.get("first"));
        }
        if (!stringStringMap.containsKey("noneexist")){
            System.out.println("dosen't exist! ");
        }

        for( String key : stringStringMap.keySet()){
            System.out.println(stringStringMap.get(key));
        }

        System.out.println(stringStringMap.values());

        stringStringMap.remove("first"); // key 값이 first인 것을 지움
        System.out.println(stringStringMap);

        stringStringMap.clear();
        System.out.println("size: " + stringStringMap.size());
    }
}
