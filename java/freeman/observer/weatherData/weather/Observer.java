package freeman.observer.weatherData.weather;
public interface Observer{
    public void update(float temp,float himidity,float pressure);
}