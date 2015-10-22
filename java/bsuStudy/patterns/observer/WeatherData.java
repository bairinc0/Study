public class WeatherData{
     //программный код
	float getTemperature(){
		//Какой то код, получающий температуру
	}
	float getHumidity(){
		//Какой то код, получающий влажность
	}
	float getPressure(){
		//Какой то код, получающий давление
	}
	public void measurementsChanged(){
		float temp=getTemperature();
		float humidity=getHumidity();
		float pressure=getPressure();
		currentConditionDisplay.update(temp,humiduty,pressure);
		currentCondition2Display.update(temp,humiduty,pressure);
		statisticsDisplay.update(temp,humidity,pressure);
		forecastDisplay.update(temp,humidity,pressure);
	}
	//программный код
}