package com.har.corejava;



import java.util.*;

public class Collections {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("Teams");
		ArrayList<String> iplteams=new ArrayList<String>();   
	      iplteams.add("RCB");
	      iplteams.add("CSK");
	      iplteams.add("MI");
	      System.out.println(iplteams);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      vec.addElement(50);
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Sandy");  
	      names.add("Moha");  	
	      names.add("nancy");
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(15);  
	       set.add(17);  
	       set.add(16);
	       set.add(18);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
	}
