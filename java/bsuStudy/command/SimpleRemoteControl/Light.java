class Light{
	private int status=0;
	public void on(){
		if (status==0){
			status=1;
			System.out.println("Light on!");
		}
	}
	public void off(){
		if (status==1){
			status=0;
			System.out.println("Light off!");
		}
	}
}