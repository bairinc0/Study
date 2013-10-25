import java.util.*;
public class ArrayIsNotIterable{
    static <T> void test(Iterable<T> ib){
        for(T t:ib){
            System.out.print(t+" ");
        }
    }
    public static void main(String [] args){
        test(Arrays.asList(1,2,3));//����� �������������� � ������
        String[] str={"a","b","c"};
        //�� ��������� - ������ �� ������������ Iterable
        //test(str);
        //���� ���� ������������� � ����, ������� ������������
        test(Arrays.asList(str));
    }
}