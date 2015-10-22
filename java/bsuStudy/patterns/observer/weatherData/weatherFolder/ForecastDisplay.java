public class ForecastDisplay implements Observer,DisplayElement{
    private float temperature;
    private float himidity;
	private float pressure;
    private Subject weatherData;
    public ForecastDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temp,float himidity,float pressure){
        this.temperature=temp;
        this.himidity=himidity;
		this.pressure=pressure;
        display();
    }    
    public void display(){
        System.out.println("Current conditions:"+temperature+" C degrees "+himidity+"% himidity and pressure="+pressure);
		System.out.println("-----------------------OUR FORECAST--------------------------");
		System.out.println("Current conditions:"+(temperature+1)+" C degrees "+(himidity+10)+"% himidity and pressure="+(pressure+3));
        System.out.println("--------------------------------------------------------------------");
    }
}