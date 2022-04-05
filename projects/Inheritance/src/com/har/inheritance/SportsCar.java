package com.har.inheritance;


class SportsCar extends LuxuaryCar 
{ 
    public int length; 
    public SportsCar(int gear,int speed,int Height) 
    {  
        super(gear, speed); 
        length = Height; 
    }  
    public void setHeight(int newValue) 
    { 
        length = newValue; 
    } 
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nCar length is "+length); 
    } 
}
