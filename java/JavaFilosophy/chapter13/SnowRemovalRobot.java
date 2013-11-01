import java.util.*;

public class SnowRemovalRobot implements Robot{
    private String name;
    public SnowRemovalRobot(String name){
        this.name=name;
    }
    public String name(){
        return name;
    }
    public String model(){
        return "SnowBot T-2000";
    }
    public List<Operation> operations(){
        return Arrays.asList(
                new Operation(){
                    public String description(){
                        return name+" can clean snow";
                    }
                    public void command(){
                        System.out.println(name+" i call you to clean snow!");
                    }
                },
                new Operation(){
                    public String description(){
                        return name+" can split ice";
                    }
                    public void command(){
                        System.out.println(name+" i call you to split ice!");
                    }
                },
                new Operation(){
                    public String description(){
                        return name+" can clean roof";
                    }
                    public void command(){
                        System.out.println(name+" i call you to clean roof!");
                    }
                }
                );
    }
    public static void main(String [] args){
        Robot.Test.test(new SnowRemovalRobot("C3Po"));
    }
}