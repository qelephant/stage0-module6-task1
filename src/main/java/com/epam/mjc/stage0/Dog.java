package com.epam.mjc.stage0;

public class Dog {
  public Dog() {
        super("brown", 4, true);
    }
  public static void main(String[] args) {
        Animal animal = new Animal("black", 3, true);
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }
}
