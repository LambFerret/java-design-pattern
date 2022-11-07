package com.lambferret.design_pattern.partterns.strategy;

public class GroundDuck extends Duck{
    public GroundDuck() {
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("im a ground duck duck");
    }
}
