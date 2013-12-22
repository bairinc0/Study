public abstract class Beverage{
    String description="unknown beverage";
    int size=1;
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}