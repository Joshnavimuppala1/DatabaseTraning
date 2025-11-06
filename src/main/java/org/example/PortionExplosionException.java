package org.example;

import javax.sound.sampled.Port;

public class PortionExplosionException  extends Exception{
    private String message;
    public PortionExplosionException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() { // to return the message of an exception
        return this.message;
    }
}
