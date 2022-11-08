package com.lambferret.design_pattern;

import com.lambferret.design_pattern.partterns.observer.CurrentConditionsDisplay;
import com.lambferret.design_pattern.partterns.observer.ForecastDisplay;
import com.lambferret.design_pattern.partterns.observer.StatisticsDisplay;
import com.lambferret.design_pattern.partterns.observer.WeatherData;
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

        /*
        // Strategy
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
        */

        //Observer
        WeatherData data = new WeatherData();

        CurrentConditionsDisplay condition = new CurrentConditionsDisplay(data);
        StatisticsDisplay statistics = new StatisticsDisplay(data);
        ForecastDisplay forecast = new ForecastDisplay(data);

        data.setMeasurements(10,20,30);
        data.setMeasurements(100, 200, 300);
        data.removeObserver(forecast);
        data.notifyObserver();


    }
}
