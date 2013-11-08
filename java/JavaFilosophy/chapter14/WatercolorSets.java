import chapter14.watercolors.*;
import java.util.*;

import static chapter14.util.Sets.*;
import static chapter14.watercolors.Watercolors.*;

public class WatercolorSets{
    public static void main(String [] args){
        Set<Watercolors> set1=EnumSet.range(BRILLIANT_RED,VIRIDIAN_HUE);
        Set<Watercolors> set2=EnumSet.range(CERULEAN_BLUE_HUE,BURNT_UMBER);
        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);
        System.out.println("union: "+union(set1,set2));
        Set<Watercolors> subset=intersection(set1,set2);
        System.out.println("intersection: "+subset);
        System.out.println("difference1: "+difference(set1,subset));
        System.out.println("difference2: "+difference(set2,subset));
        System.out.println("complement: "+complement(set1,set2));
    }
}