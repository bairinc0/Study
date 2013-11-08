public class GenericHolder<T>{
    private T obj;
    public void set(T o){
        obj=o;
    }
    public T get(){
        return obj;
    }
    public static void main(String [] args){
        GenericHolder<String> gh=new GenericHolder<String>();
        gh.set("Item");
        String s=gh.get();
        System.out.println(s);
    }
}