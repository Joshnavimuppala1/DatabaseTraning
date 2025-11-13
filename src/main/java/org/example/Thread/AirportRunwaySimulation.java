package org.example.Thread;

public class AirportRunwaySimulation {

    public static void main(String[] args){

        Runway runway = new Runway();

        plane p1 = new plane("AI101", runway);
        plane p2 = new plane("BA202", runway);
        plane p3 = new plane("EK303", runway);

        p1.start();
        p2.start();
        p3.start();

    }
}
