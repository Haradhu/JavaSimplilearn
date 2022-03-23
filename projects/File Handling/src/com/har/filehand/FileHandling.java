package com.har.filehand;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {

	public static void main(String[] args) {


			File file  = new File("F:\\\\\\\\Harish\\\\\\\\projects\\\\\\\\File Handling\\\\\\\\testfile5.txt");
			
			
					
			
			try {
				System.out.println("Is new file created now "+file.createNewFile());
				
				FileWriter writer = new FileWriter(file, true);

				writer.write("ABC HELLO GUYS , SIMPLILEARN");
					
					writer.flush();
				
				FileInputStream  reader = new FileInputStream(file);
				
				int num =0;
				
					while((num=reader.read()) != -1) {
						
						System.out.print((char)num);
						
					}
				
				//boolean isfileDeleted =	file.delete();
				
				Files.deleteIfExists(Paths.get("F:\\\\\\\\Harish\\\\\\\\projects\\\\\\\\File Handling\\\\\\\\testfile5.txt"));
				
			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
