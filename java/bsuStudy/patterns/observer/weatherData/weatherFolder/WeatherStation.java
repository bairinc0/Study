public class WeatherStation{
    public static void main(String [] args){
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecast=new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,65,30);
		System.out.println("-----------------------NEW DATA INCOMING--------------------------");
		weatherData.setMeasurements(80,45,40);        
    }
}