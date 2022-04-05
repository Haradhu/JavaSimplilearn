package com.har.keyc;


public class Finnalydemo
{
    public static void main(String[] args)
    {
        int a=5,b=9,c=0;
        try
        {
            c = a * b;
        }
        catch(ArithmeticException e)
        {
            System.out.print("\n\tError : " + e.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + c);
        }
    }
}
