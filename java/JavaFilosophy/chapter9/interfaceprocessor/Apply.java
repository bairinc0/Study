//Вариант с интерфейсом
package chapter9.interfaceprocessor;
public class Apply{
    public static void process(Processor p, Object s){
        System.out.println("Using processor "+p.name());
        System.out.println(p.process(s));
    }
}