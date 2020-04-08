package HeadFirstObserverPattern;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0F;
    private float minTemp = 200.0F;
    private float tempSum = 0.0F;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + this.tempSum / (float)this.numReadings + "/" + this.maxTemp + "/" + this.minTemp);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            this.tempSum += this.weatherData.getTemperature();
            ++this.numReadings;
            if (this.weatherData.getTemperature() > this.maxTemp) {
                this.maxTemp = this.weatherData.getTemperature();
            }

            if (this.weatherData.getTemperature() < this.minTemp) {
                this.minTemp = this.weatherData.getTemperature();
            }

            this.display();
        }

    }
}

