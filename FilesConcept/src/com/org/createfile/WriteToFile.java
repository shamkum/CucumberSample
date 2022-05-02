package com.org.createfile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	
	public static void main(String[] args) {
		try{
			FileWriter writer = new FileWriter("C:/Users/Shamkumar/Desktop/File Handling/newfile.txt");
			writer.write("The owner of this File is Shamkumar");
			writer.close();
			System.out.println("Text is inserted");
		}catch(IOException i){
			System.out.println("An error occured");
			i.printStackTrace();
		}
	}

}
