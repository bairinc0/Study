class Dog {
	String woof="WOOF!";
    void sound() {
		System.out.println(woof);
    }
	void sound(int n) {
		for(int i=0;i<n;i++){
			System.out.print(woof+" ");
		}	
		System.out.println();		
    }
    void sound(int n,int m){
		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++){
				if (j>=i){
					System.out.print(woof+" ");
				}
				else{
					System.out.print("      ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		Dog d=new Dog();
		System.out.println("Simple sound:");
		d.sound();
		System.out.println("-----------------------------------------");
		System.out.println("Multy sound:");
		d.sound(6);
		System.out.println("-----------------------------------------");
		System.out.println("Matrix sound:");
		d.sound(6,4);
	}
}