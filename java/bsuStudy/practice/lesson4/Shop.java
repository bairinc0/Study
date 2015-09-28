public class Shop{
	public static void main (String [] a){
		TV tv=new TV();
		//product attrs
		tv.setName("LG-32msj");		
		tv.setDiscount(10.0);
		tv.setPrice(20000);		
		//electronics attrs
		tv.warrantly=3;
		tv.producer="LG corporation";
		//tv attrs
		tv.screen=32;
		System.out.println(tv);
	}
}