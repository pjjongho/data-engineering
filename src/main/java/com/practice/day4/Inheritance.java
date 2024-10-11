package com.practice.day4;

public class Inheritance {
    static class Animal {
        String name;

        Animal(String name){
            this.name=name;
        }
        public void cry() {
            System.out.println((name+" is crying"));
        }
    }
    static class Giraffe extends Animal {
        Giraffe(String name){
            super(name);
        }

        @Override
        public void cry() {
            super.cry();
            System.out.println(name + " cannot cry.");
        }
    }


    static class Dog extends Animal {

        String breed;
        int age;

        Dog(String name, String breed, int age) {
            super(name);
            this.breed = breed;
            this.age = age;
        }

        public void bark(){
            System.out.println(name + "(" + breed + ") is barking and he is " +
                    age +" years old" );
        }
    }


    public static void main(String[] args) {
        Dog dog = new Dog("코코", "허스키", 10);
        dog.cry();
        dog.bark();

        Animal animal = dog;
        animal.cry();

        Animal giraffe = new Giraffe("기린이");
        giraffe.cry();

    }
}
