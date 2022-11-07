package com.lambferret.design_pattern.partterns.strategy;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("grounded you and i");
    }
}
