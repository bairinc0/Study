import chapter10.controller.*;
public class GreenhouseController{
    public static void main(String [] args){
        GreenhouseControls gc=new GreenhouseControls();
        gc.addEvent(gc.new Bell(900));
        Event [] eventList={
            gc.new TermostatNight(0),
            gc.new LightOn(200),
            gc.new LightOff(400),
            gc.new WaterOn(600),
            gc.new WaterOff(800),
            gc.new TermostatDay(1400)
        };
        gc.addEvent(gc.new Restart(2000,eventList));
        if (args.length==1){//в качестве параметра задаём в милисекундах через сколько сделать остановку
            gc.addEvent(new GreenhouseControls.Terminate(new Integer(args[0])));
        }    
        else{
            gc.addEvent(new GreenhouseControls.Terminate(5000));
        }    
        gc.run();
    }
}