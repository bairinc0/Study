public class ArrayOfGeneric{
    static final int SIZE=100;
    static Generic<Integer>[] gia;
    @SuppressWarnings("unchecked")
    public static void main(String [] args){
        //Ошибка при выполнении
        //gia=(Generic<Integer>[])new Object[SIZE];
        gia=(Generic<Integer>[])new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0]=new Generic<Integer>();
        //ниже не компилируется
        //gia[1]=new Object();
        //gia[2]=new Generic<Double>();
    }
}