import HeadFirstObserverPattern.CurrentConditionsDisplay;
import HeadFirstObserverPattern.ForecastDisplay;
import HeadFirstObserverPattern.StatisticsDisplay;
import HeadFirstObserverPattern.WeatherData;

public class WeatherStation {

    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(100, 65, 30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
