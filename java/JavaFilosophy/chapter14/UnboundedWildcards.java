import java.util.*;
public class UnboundedWildcards{
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;
    static void assign1(List list){
        list1=list;
        list2=list;
    }
    static void assign2(List<?> list){
        list1=list;
        list2=list;
        list3=list;
    }
    static void assign3(List<? extends Object> list){
        list1=list;
        list2=list;
        list3=list;
    }
    public static void main(String [] a){
        assign1(new ArrayList());
        assign2(new ArrayList());
        assign1(new ArrayList<String>());
        assign2(new ArrayList<String>());
        assign3(new ArrayList<String>());
        List<?> wildList1=new ArrayList();
        List<?> wildList2=new ArrayList<String>();
        assign1(wildList1);
        assign2(wildList1);
        assign3(wildList1);
        assign1(wildList2);
        assign2(wildList2);
        assign3(wildList2);
    }
}