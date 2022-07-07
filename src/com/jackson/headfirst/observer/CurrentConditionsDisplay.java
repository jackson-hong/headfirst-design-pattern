package com.jackson.headfirst.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    @Override
    public void display() {
        System.out.println("temperature : " + temperature + " humidity : " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
