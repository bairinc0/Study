import chapter14.util.*;
import java.util.*;
class Customer{
    private static long counter=1;
    private final long id=counter++;
    private Customer(){
        
    }
    public String toString(){
        return "Customer "+id;        
    }
    public static Generator <Customer> generator(){
            return new Generator <Customer>(){
                public Customer next(){
                    return new Customer();
                }
            };
    }
}
class Teller{
    private static long counter=1;
    private final long id=counter++;
    private Teller(){}
    public String toString(){
        return "Teller "+id;
    }    
    public static Generator <Teller> generator=new Generator <Teller>(){
        public Teller next(){
            return new Teller();
        }
    };        
}
public class BankTeller{
    public static void serve(Teller t,Customer c){
        System.out.println(t+ " serves for "+c);
    }
    public static void main(String [] args){
        Random rand=new Random(47);
        Generator <Teller> gent=Teller.generator;
        Teller t=gent.next();
        Queue <Customer> line=new LinkedList<Customer>();
        Generators.fill(line,Customer.generator(),15);
        List<Teller> tellers=new ArrayList<Teller>();
        Generators.fill(tellers,Teller.generator,4);
        for (Customer c:line){
            serve(tellers.get(rand.nextInt(tellers.size())),c);
        }
        System.out.println("--------------- test singleton -----------------------");
        Generator<Customer> genc=Customer.generator();
        Customer c=genc.next();
        
        serve(t,c);
        serve(t,c);
        serve(t,c);
    }
}