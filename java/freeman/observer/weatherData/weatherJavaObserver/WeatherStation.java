import freeman.weatherData.weather.*;
import java.util.*;
public class WeatherStation{
    public static void main(String [] args){
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statDisplay=new StatisticsDisplay(weatherData);
        UIDisplay androidDisplay=new UIDisplay(weatherData);
        System.out.println();
        System.out.println("-------Measurments N1---------");
        weatherData.setMeasurements(80,65,30);
        System.out.println();
        System.out.println();
        System.out.println("-------Measurments N2---------");
        weatherData.setMeasurements(70,30,30);
        System.out.println();System.out.println();
        System.out.println("-------Measurments N3---------");
        weatherData.setMeasurements(35,98,30);
    }
}