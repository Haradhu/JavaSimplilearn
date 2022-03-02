package com.har.corejava;


import java.util.regex.Pattern;

//Pattern class method
class RegularExpression {

 public static void main(String args[])
 {
     System.out.println(Pattern.matches(
         "HelloH*ai", "HelloHai"));

     // Hello txt does not match Hai txt so it come as false
     System.out.println(
         Pattern.matches("Hello", "Hai"));
 }
}

