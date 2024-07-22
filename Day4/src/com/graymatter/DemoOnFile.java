package com.graymatter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoOnFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("demo.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canWrite());

	
	
	FileWriter fw= new FileWriter("demo.txt");
	String str="Hello world";
	for(char c:str.toCharArray())
		fw.write(c);
	fw.close();
	
	FileReader fr= new FileReader("demo.txt");
	int ch;
	StringBuffer sbf= new StringBuffer();
	while((ch=fr.read())!=-1)
		sbf.append(ch);
	String s=sbf.toString();
	System.out.println(s);
	fr.close();
	
	
	
//	public static void main(String[] args) {
//	    try {
//	      File myObj = new File("filename.txt");
//	      if (myObj.createNewFile()) {
//	        System.out.println("File created: " + myObj.getName());
//	      } else {
//	        System.out.println("File already exists.");
//	      }
//	    } catch (IOException e) {
//	      System.out.println("An error occurred.");
//	      e.printStackTrace();
//	    }
//	  }
	}
}
