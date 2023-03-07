package com.epam.mjc.stage0;

public class Bird {
    public Bird() {
        super("blue", 2, false);
    }
    @Override
    public String getDescription() {
        String plural = getNumberOfPaws() == 1 ? "paw" : "paws";
        String fur = isHasFur() ? "a" : "no";
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
}
