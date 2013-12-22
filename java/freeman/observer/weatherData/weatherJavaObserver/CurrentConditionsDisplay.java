import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    Observable observable;
    public CurrentConditionsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }
    public void update(Observable obs, Object arg){
        if (obs instanceof WeatherData){
            WeatherData weatherData=(WeatherData)obs;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            display();
        }
        
    }
    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
            (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
            (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *  
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +     
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }
    public void display(){
        System.out.println("-----------------------Current Condition----------------------------------");
        System.out.println("Current conditions:"+temperature+" C degrees "+humidity+"% himidity and heatIndex="+computeHeatIndex(temperature,humidity));
       
    }
}