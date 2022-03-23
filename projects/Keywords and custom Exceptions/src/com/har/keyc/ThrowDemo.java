package com.har.keyc;



public class ThrowDemo
{
    public static void main(String[] args)
    {

        int a=45,b=5,c;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                c = a / b;
                System.out.print("\n\tThe result is : " + c);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\t ****Program ends****.");
    }
}

