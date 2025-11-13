package org.example.Thread;

public class plane  extends Thread{

    private String planeId;
    private Runway runway;

       plane(String planeId,Runway runway){
           this.planeId = planeId;
           this.runway = runway;
       }
    @Override
    public void run(){
           runway.userRunway(planeId);

    }
}
