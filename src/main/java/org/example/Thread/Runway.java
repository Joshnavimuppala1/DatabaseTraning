package org.example.Thread;
//
public class Runway {
    public synchronized void userRunway(String planeId){
        try{
            System.out.println(planeId+ "requesting permission to take off");

            System.out.println(planeId+ "taking off...");
            Thread.sleep(2000);

            System.out.println(planeId+ "has successfully taken off.\n");
       }catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
