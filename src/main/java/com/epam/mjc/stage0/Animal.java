package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
  
    public String getDescription(){
      String fur = hasFur ? "a" : "no";
      String paw = numberOfPaws > 1 ? "paws" : "paw";
      String text = "This animal is mostly" + color + ". It has " + numberOfPaws +" "+ paw + " and " + fur + "fur.";
      return text;
    }
}
