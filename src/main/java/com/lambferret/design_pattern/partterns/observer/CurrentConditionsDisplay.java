package com.lambferret.design_pattern.partterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    public WeatherData weatherData;
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();

    }
    @Override
    public void introduce() {
        System.out.println("제이름은 CurrentConditions");
    }

    @Override
    public void display() {
        System.out.printf("CurrentConditions 현재온도 : %f, 습도 : %f \n", temp, humidity);
    }
}
