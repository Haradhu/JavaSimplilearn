package com.demo.projects;//creating File program
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateNewFile {
	
public static void main(String[] args) {
	File file =new File("F:/HarishProjects/src/input.txt");
	
	try {
		System.out.println(file.createNewFile());
		FileWriter writer=new FileWriter(file);
		writer.write(65);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
