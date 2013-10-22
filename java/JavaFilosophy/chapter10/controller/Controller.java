package chapter10.controller;

import java.util.*;
public class Controller{
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c){
        eventList.add(c);
    }
    public void run(){
        while(eventList.size()>0){
            for(Event e:new ArrayList<Event>(eventList)){
                if (e.ready()){
                    System.out.println(e+" time="+System.nanoTime());
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}