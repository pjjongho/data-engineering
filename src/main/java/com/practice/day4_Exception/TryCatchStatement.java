package com.practice.day4_Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchStatement {
    public static void main(String[] args) {

        int number =10;

        for (int i = 10; i >=0; i--){
            try{
                int result = number/i;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Exception occured: " + e.getMessage());
            } finally {
                System.out.println("Alawys executed");
            }
        }
    }
}
