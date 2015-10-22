class TopolM implements FlyBehaviour{
	int firePower=100000;
	int coordinateX;
	int coordinateY;
	void attack(){
		System.out.println("i am attacking target("+coordinateX+","+coordinateY+")");
	}
	public void fly(){
		System.out.println("I fly like rocket with firepower="+firePower);
	}
}