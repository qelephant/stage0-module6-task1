package com.epam.mjc.stage0;

public class Bird {
    public Bird() {
        super("blue", 2, false);
    }

    public String getDescription() {
         String plural = numberOfPaws == 1 ? "paw" : "paws";
        String fur = hasFur ? "a" : "no";
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
}
