import java.util.*;

public class Staff extends ArrayList<Position>{
    public void add(String title,Person person){
        add(new Position(title,person));
    }
    public void add(String... titles){
        for(String title:titles){
            add (new Position(title));
        }
    }
    public Staff(String... titles){
        add(titles);
    }
    public boolean positionAvailable(String title){
        for (Position position:this){
            if (position.getTitle().equals(title)&&position.getPerson()==Person.NULL)
                return true;
        }
        return false;
    }
    public void fillPosition(String title,Person hire){
        for (Position position:this){
            if (position.getTitle().equals(title)&&position.getPerson()==Person.NULL){
                position.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position "+title+" not availablie");
    }
    public static void main(String [] args){
        Staff staff=new Staff("President","CTO","Marketing Manager","Product Manager","Project Lead","Software engineer","Software engineer","Software engineer","Test engineer","Technical writer");
        staff.fillPosition("President",new Person("Me","last","The top"));
        staff.fillPosition("Project Lead",new Person("janet","planner","burbs"));
        if (staff.positionAvailable("Software Enginner")){
            staff.fillPosition("Software Enginner",new Person("Bob","Coder","Paladin"));
        }
        System.out.println(staff);
    }
}