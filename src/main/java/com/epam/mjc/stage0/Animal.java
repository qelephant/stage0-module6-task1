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
        String plural = getNumberOfPaws() == 1 ? "paw" : "paws";
        String fur = isHasFur() ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + plural + " and " + fur + " fur.";
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


