import java.util.*;
public class PancakeHouseMenuIterator implements Iterator{
    ArrayList items;
    int current=0;
    public PancakeHouseMenuIterator(ArrayList items){
        this.items=items;
    }
    public Object next(){
        Object item=items.get(current);
        current++;
        return item;
    }
    public boolean hasNext(){
        if (current>=items.size()||items.get(current)==null){
            return false;
        }
        else{
            return true;
        }
    }
    
}