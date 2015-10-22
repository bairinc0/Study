import freeman.observer.weatherData.weather.*;
import java.util.*;
public class WeatherStation{
    public static void main(String [] args){
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30);
        weatherData.setMeasurements(70,30,30);
        weatherData.setMeasurements(35,98,30);
    }
}