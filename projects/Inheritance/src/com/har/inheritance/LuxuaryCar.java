package com.har.inheritance;


class LuxuaryCar  
{ 
    public int gear; 
    public int speed; 
    public LuxuaryCar(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("No of gears are " + gear + "\n" + "speed of the car is " + speed); 
    }  
} 
