import java.util.*;
public class EnumerationIterator implements Iterator{
    Enumeration enumer;
    public EnumerationIterator(Enumeration enumer){
        this.enumer=enumer;
    }
    public boolean hasNext(){
        return enumer.hasMoreElements();
    }
    public Object next(){
        return enumer.nextElement();
    }
    public void remove(){
        throw new UnsupportedOperationException();
    }
}