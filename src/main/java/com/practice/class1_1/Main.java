package com.practice.class1_1;

public class Main {
    static class Person {
        String name;
        String country;
        int age;

        Person(String name, String country, int age){
            this.name = name;
            this.country = country;
            if ("USA".equals(country)){
                this.age = age - 1;
            } else{
                this.age = age;
            }

        }


        Person(){

        }

    }

    public static void main(String[] args) {
        Person thor = new Person("thor", "Asgard", 10);
//        thor.name = "thor";
//        thor.country = "Asgard";
//        thor.age = 1000;

        Person Steven = new Person("Captain America", "USA", 70);
//        Steven.name = "Captain America";
//        Steven.country = "USA";
//        Steven.age = 70;

        Person[] persons = {thor, Steven};
        for (Person cur : persons){
            System.out.println("<Avengers>");
            System.out.println("Hi i am " + cur.name + " god of thunder");
            System.out.println("I was born " + cur.country);
            System.out.println("I am " + cur.age +" years old");
        }
    }
}
