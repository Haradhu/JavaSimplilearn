package com.har.lockerkey;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
    public class LockerKey {
          public static void main(String[] args) {
    
       System.out.println("****Company Lockers Pvt Ltd****");
       System.out.println("****Welcome to LockedMe.com****");
     
            File newFolder=new File("New Updates");
            newFolder.mkdir();//boolean..
            optionSelection(newFolder);
}
    private static void optionSelection(File newFolder) {
          String []arr= {"1.File Menu","2.Display the files","3.Way out\n"};
    int []arr1= {1,2,3};
    int len= arr1.length;
                  System.out.println();
    for(int i = 0;i<len;i++) {
            System.out.println(arr[i]);
}
           System.out.println("Specify the operation to be performed:");
                     Scanner scan =new Scanner(System.in);
            int options= scan.nextInt();
                       switch(options){
/*case 1:
   String[] fileNames=new String[100];
     fileNames = newFolder.list();
      if(fileNames.length==0) {
        System.out.println("the folder is empty");
}
else {
  Arrays.sort(fileNames);
System.out.println("The files present are");
for(String name:fileNames) {
//Enhanced ForLoop
         System.out.println(name);
}
}
     optionSelection(newFolder);
  break;*/
case 1:
       System.out.println("File Menu options");
        fileManipulation(newFolder);
    break;
case 2:
	   String[] fileNames=new String[100];
	     fileNames = newFolder.list();
	      if(fileNames.length==0) {
	        System.out.println("the folder is empty");
	}
	else {
	  Arrays.sort(fileNames);
	System.out.println("The files present are");
	for(String name:fileNames) {
	//Enhanced ForLoop
	         System.out.println(name);
	}
	}
	     optionSelection(newFolder);
	  break;
case 3:
           System.out.println("****Thank You For Exploring and Visit again****");
           System.out.println("****SIGNING OFF****");
  break;
    default:
      System.out.println("Wrong input\nTry Again"); 
      optionSelection(newFolder);
  break;
}
}
    private static void fileManipulation(File newFolder) {
  System.out.println("1.Adding a File");
  System.out.println("2.Delete a File");
  System.out.println("3.Search a File");
  System.out.println("4.Go back to Main Menu\n");
  System.out.println("Enter your choice");
          Scanner sc = new Scanner(System.in);
int choice=sc.nextInt();
switch(choice) {
   case 1:
          System.out.println("Adding a file\n");
          System.out.println("Enter the name of the file you want to add:");
           String newFile=new Scanner(System.in).nextLine();
            File addFile=new File(newFolder,newFile);
                try {
                         if(addFile.createNewFile())
                   System.out.println("The file added to the folder");
          else
               System.out.println("File already exist");
} catch (IOException e) { 
             System.out.println("Issue :"+ e.getMessage());
}
          fileManipulation(newFolder);
   break;
     case 2:
           System.out.println("Delete a file");
      System.out.println("Enter the name of the file you have to delete:");
         String fileName= new Scanner(System.in).nextLine();
     File delFile=new File(newFolder,fileName);
      if(delFile.exists()) {
      if(delFile.delete()) {
            System.out.println("The file deleted successfuly");
}
   else
    System.out.println("The file deletion was unsuccessfull");
}
   else
   System.out.println("The specified file was not found");
      fileManipulation(newFolder);
     break;
     case 3:
             System.out.println("Search a file");
              System.out.println("Enter the file name you have to search");
           String serFile=new Scanner(System.in).nextLine();
           File searchFile= new File(newFolder,serFile);
            if(searchFile.exists()) {
       System.out.println("The Searched file is present");
}
else
      System.out.println("The searched file is not present");
          fileManipulation(newFolder);
         break;
case 4:
     System.out.println("Back to main menu");
      optionSelection(newFolder);
   break;
    default:
      System.out.println("Wrong input\ntry again");
        fileManipulation(newFolder);
break;
}
}
}