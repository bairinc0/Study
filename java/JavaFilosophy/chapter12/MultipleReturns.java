public class MultipleReturns{
    public static void f(int i){
        System.out.println("I want to close!");
        try{
            System.out.println("point 1");
            if (i==1) return;
            System.out.println("point 2");    
            if (i==2) return;
            System.out.println("point 3");    
            if (i==3) return;
            System.out.println("the end");    
            return;
        }
        finally{
            System.out.println("Ending");    
        }
    }
    public static void main(String [] args){
        for (int i=1;i<4;i++){
            f(i);
        }
    }
}