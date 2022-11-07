package com.lambferret.design_pattern;

import com.lambferret.design_pattern.partterns.strategy.*;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties("application.yaml")
public class DesignPatternApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) {
        Duck duck = new WaterDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.setQuackBehavior(new Quack());
        duck.performQuack();
        duck.performFly();

        Duck secondDuck = new GroundDuck();
        duck.setFlyBehavior(new FlyNoWay());
        secondDuck.setFlyBehavior(new FlyNoWay());
        secondDuck.setQuackBehavior(new Quack());
        duck.performFly(); // 재할당 가능
        secondDuck.performFly();
        secondDuck.performQuack();


    }
}
