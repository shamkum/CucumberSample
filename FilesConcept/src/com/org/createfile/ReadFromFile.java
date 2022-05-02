package com.org.createfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:/Users/Shamkumar/Desktop/File Handling/newfile.txt");
		Scanner s = new Scanner(f);
		while(s.hasNextLine()){
			String data = s.nextLine();
			System.out.println(data);
		}
	}

}
