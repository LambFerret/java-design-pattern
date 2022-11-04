package com.lambferret.design_pattern.partterns.strategy;

public class WaterDuck extends Duck{
    public WaterDuck() {
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("im a water duck duck");
    }
}
