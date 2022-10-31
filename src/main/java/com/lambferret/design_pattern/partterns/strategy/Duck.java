package com.lambferret.design_pattern.partterns.strategy;

public abstract class Duck {
    QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }
}
