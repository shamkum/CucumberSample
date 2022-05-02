package com.org.createfile;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) {
		try{
			File f = new File("C:/Users/Shamkumar/Desktop/File Handling/newfile.txt");
			if(f.createNewFile()){
				System.out.println("File Created: "+f.getName());
			}else{
				System.out.println("File already exists");
				
			}
		}catch(IOException i){
			System.out.println("An error occured");
			i.printStackTrace();
		}
	}

}
