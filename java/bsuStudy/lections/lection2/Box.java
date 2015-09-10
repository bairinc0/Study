class Box{
	Cat catInBox;
	public void add(Cat catInBox){
		this.catInBox=catInBox;
	}
	public String toString(){
		return "there is cat in box:"+catInBox;
	}
}