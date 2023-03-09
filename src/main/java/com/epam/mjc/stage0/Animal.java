package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {
    }

    public String getDescription() {
        String plural = numberOfPaws == 1 ? "paw" : "paws";
        String fur = hasFur ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + plural + " and " + fur + " fur.";
    }

    public static void main(String[] args) {
        Animal animal = new Animal("blue", 1, false);
        Dog dog = new Dog();
        Bird bird = new Bird();

        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}


