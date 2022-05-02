package com.org.createfile;

import java.io.File;

public class FileInformation {
	
	public static void main(String[] args) {
		File f = new File("C:/Users/Shamkumar/Desktop/File Handling/newfile.txt");
		if(f.exists()){
			System.out.println("File Name: "+f.getName());
			System.out.println("File Path: "+f.getAbsolutePath());
			System.out.println("Readable: "+f.canRead());
			System.out.println("Writable: "+f.canWrite());
			System.out.println("File Size in bytes: "+f.length());
		}else{
			System.out.println("The File doesn't exists");
		}
	}

}
