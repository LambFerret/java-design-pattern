package com.lambferret.design_pattern.partterns.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can fly with wings");
    }
}
