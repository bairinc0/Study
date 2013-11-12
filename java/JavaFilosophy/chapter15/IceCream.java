import java.util.*;

public class IceCream{
    private static Random rand=new Random(47);
    static final String[] FLAVORS={
        "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
        "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
        "Praline Cream", "Mud Pie"
    };
    public static String[] flavorSet(int n){
        if (n>FLAVORS.length){
            throw new IllegalArgumentException("set is too big");
        }
        String[] results=new String[n];
        boolean[] picked=new boolean[FLAVORS.length];
        for (int i=0;i<n;i++){
            int t;
            do{
                t=rand.nextInt(FLAVORS.length);
            }
            while (picked[t]);
            results[i]=FLAVORS[i];
            picked[t]=true;  
        }
        return results;
    }
    public static void main(String [] args){
        for(int i=1;i<7;i++){
            System.out.println(Arrays.toString(flavorSet(i)));
        }
    }
}