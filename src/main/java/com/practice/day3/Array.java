package com.practice.day3;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intEmptyArray = new int[5];
        System.out.println(Arrays.toString(intEmptyArray));

        int[] intArray = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(intArray));

        String[] stringEmptyArray = new String[5];
        System.out.println(Arrays.toString(stringEmptyArray));

        String[] month = {"1월", "2월", "3월"};
        System.out.println(Arrays.toString(month));

        int[] scores = new int[4];
        scores[0]=5;
        scores[1]=10;
        System.out.println(Arrays.toString(scores));

        scores[1]=100;
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[1]);

        int[] StringQuiz = new int[]{10,20,30};
        System.out.println(StringQuiz[2]);
        System.out.println(StringQuiz[StringQuiz.length - 1]);
    }

}
