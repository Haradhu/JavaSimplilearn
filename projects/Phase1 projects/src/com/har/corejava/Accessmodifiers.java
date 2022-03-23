package com.har.corejava;


//default access modifiers
class newclass
{ 
    void display()      //no access modifier indicates default modifier
       { 
           System.out.println("Display with 'dafault' specifiers"); 
       } 
} 
 
class Accessmodifiers
{ 
    public static void main(String args[]) 
       {   
          //access class with default scope
          newclass obj = new newclass(); 
   
          obj.display();    //access class method with default scope
       } 
}
/*class Data {
    // private variable
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Accessmodifiers {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.setName("ItWorld");
    }
}*/