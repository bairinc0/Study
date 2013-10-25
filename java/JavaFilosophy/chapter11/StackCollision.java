import chapter11.mindview.util.*;

public class StackCollision{
    public static void main(String []args){
        chapter11.mindview.util.Stack <String> stack=new chapter11.mindview.util.Stack <String>();
        for (String s:"My dog has spots".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.println(stack.pop()+" ");
        }
        System.out.println("Default stack: ");
        java.util.Stack <String> stack2=new java.util.Stack <String>();
        for (String s:"My dog has teeth".split(" ")){
            stack2.push(s);
        }
        while (!stack2.empty()){
            System.out.println(stack2.pop()+" ");
        }
    }
}