package HeadFirstObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.9F;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void display() {
        if (this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (this.currentPressure == this.lastPressure) {
            System.out.println("More of the same");
        } else if (this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            if (weatherData.getPressure() > this.currentPressure) {
                this.lastPressure = this.currentPressure;
            }

            this.currentPressure = weatherData.getPressure();
            this.display();
        }

    }
}