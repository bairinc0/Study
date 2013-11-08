public class SimpleHolder{
    private Object obj;
    public void set(Object o){
        obj=o;
    }
    public Object get(){
        return obj;
    }
    public static void main(String [] args){
        SimpleHolder sh=new SimpleHolder();
        sh.set("Item");
        String s=(String)sh.get();
        System.out.println(s);
    }
}