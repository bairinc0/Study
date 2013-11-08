public class GenericArray<T>{
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArray(int size){
        array=(T[])new Object[size];
    }
    public void put(int index,T item){
        array[index]=item;
    }
    public T get(int index){
        return array[index];
    }
    public T[]rep(){
        return array;
    }
    public static void main(String [] args){
        GenericArray<Integer> gia=new GenericArray<Integer>(10);
        //ниже не выполняется
        //Integer []ia =gia.rep();
        Object []oa =gia.rep();
        gia.put(1,new Integer(0));
        gia.put(2,3);
    }
}