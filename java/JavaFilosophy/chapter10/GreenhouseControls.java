import chapter10.controller.*;
public class GreenhouseControls extends Controller{
    private boolean light=false;
    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.out.println("Light on!");
            light=true;
        }
        public String toString(){
            return "Light is ON!";
        }
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.out.println("Light off!");
            light=false;
        }
        public String toString(){
            return "Light is OFF!";
        }
    }
    private boolean water=false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.out.println("Water on!");
            light=true;
        }
        public String toString(){
            return "Water is ON!";
        }
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.out.println("Water off!");
            light=false;
        }
        public String toString(){
            return "Water is OFF!";
        }
    }
    private String termostat="Day";
    public class TermostatNight extends Event{
        public TermostatNight(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.out.println("Night is coming!");
            termostat="Night";
        }
        public String toString(){
            return "It is Night!";
        }
    }
    public class TermostatDay extends Event{
        public TermostatDay(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.out.println("Day is coming!");
            termostat="Day";
        }
        public String toString(){
            return "It is Day!";
        }
    }
    public class Bell extends Event{
        public Bell(long delayTime){
            super(delayTime);
        }
        public void action(){
            addEvent(new Bell(delayTime));
        }
        public String toString(){
            return "bam!";
        }
    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList=eventList;
            for (Event e:eventList){
                addEvent(e);
            }
                        
        }
        public void action(){
            for (Event e:eventList){
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString(){
            return "restarting system!";
        }
    }
    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }
        public void action(){
            System.exit(0);
        }
        public String toString(){
            return "Switch off system";
        }
    }
}