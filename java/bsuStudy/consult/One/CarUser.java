public class CarUser{
	public static void main(String [] args){
		//1. Чтобы использовать класс нужно создать его ОБЪЕКТ
		Car c1=new Car();
		Car c2=new Car();
		c1.color="red";
		c1.model="Lada";
		c1.volume=10;
		c2.color="green";
		c2.model="Volga";
		c2.volume=12;
		c1.printCar();
		c2.printCar();
	}
}