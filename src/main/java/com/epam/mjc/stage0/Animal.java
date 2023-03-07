package com.epam.mjc.stage0;

public class Animal {
    public String color;
    public int numberOfPaws;
    public boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String plural = numberOfPaws == 1 ? "paw" : "paws";
        String fur = hasFur ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + plural + " and " + fur + " fur.";
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur(){
        return hasFur;
    }
}
