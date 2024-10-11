package com.practice.day4_Quiz2;

public class Main {
    public static void main(String[] args) {
        ArrayCalculation arrayCalculation = new ArrayCalculation();

        System.out.println(" 2 / 1 ="+ arrayCalculation.divide(2,1));
        try {
            System.out.println("1 / 0 =" + arrayCalculation.divide(1,0));
        } catch (ArithmeticException arithmeticException){
            System.out.println("It's Wrong Calculate. " + arithmeticException.getMessage());
        }
        try {
            System.out.println("Try to divide using out of index element = " + arrayCalculation.divide(5,0));
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Out of Index range divided. started index is 0 " + (arrayCalculation.arr.length-1));
        }
    }
}
