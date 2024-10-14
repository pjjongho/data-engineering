package com.practice.day6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collection<String> collection = list;
    }
}
