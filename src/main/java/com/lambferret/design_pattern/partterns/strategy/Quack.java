package com.lambferret.design_pattern.partterns.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK QUACK");
    }
}
