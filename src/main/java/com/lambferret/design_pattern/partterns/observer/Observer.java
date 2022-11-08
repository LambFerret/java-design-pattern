package com.lambferret.design_pattern.partterns.observer;


public interface Observer {
    void update(float temp, float humidity, float pressure);
    void introduce();

}
