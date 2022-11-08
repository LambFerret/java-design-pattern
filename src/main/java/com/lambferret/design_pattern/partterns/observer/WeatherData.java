package com.lambferret.design_pattern.partterns.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        System.out.print("누군가 등록했어요 ");
        o.introduce();
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        System.out.print("저 나갈게요 ");
        o.introduce();
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(u -> u.update(temp, humidity, pressure));
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
