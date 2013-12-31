public class ChocolateBoiler{
    //строка ниже работает с синхронизацией всего метода getInstance
    //private static ChocolateBoiler instance;
    private volatile static ChocolateBoiler instance;
    private boolean empty,boiled;
    private ChocolateBoiler(){
        empty=true;
        boiled=false;
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
    public void fill(){
        if (isEmpty()){
            empty=false;
            boiled=false;
        }
    }
    public void drain(){
        if (!isEmpty()&&isBoiled()){
            empty=true;
            //boiled=false;
        }
    }
    public void boil(){
        if (!isEmpty()&&!isBoiled()){
            boiled=true;
        }
    }
    //синхронизация метода слишком тормозит приложение при частом обращении!
    /*public static synchronized ChocolateBoiler getInstance(){
        if (instance==null){
            instance=new ChocolateBoiler();
        }
        return instance;
    }*/
    public static ChocolateBoiler getInstance(){
        if (instance==null){
            //выполним синхронизацию только при создании!
            synchronized (ChocolateBoiler.class){
                if (instance==null){
                    instance=new ChocolateBoiler();
                }
            }
        }
        return instance;
    }
}