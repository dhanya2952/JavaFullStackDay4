package com.graymatter;

import java.io.BufferedReader;

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Files {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		File file = new File("demo2.txt");
//		file.createNewFile();
//		FileWriter fw= new FileWriter("demo2.txt");
//		String str="Hello world";
//		for(char c:str.toCharArray())
//			fw.write(c);
//		
//		
//		
//		
//	}
//
//}

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws IOException {
        String fileName = "paragraph.txt";
        String paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. ";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(paragraph);
            System.out.println("Paragraph has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
        
    
    
            int lineCount = 0;
            try (BufferedReader read = new BufferedReader(new FileReader("paragraph.txt"))) {
                while (read.readLine() != null) {
                    lineCount++;
                }
                System.out.println("Number of lines: " + lineCount);
            } catch (IOException e) {
                e.printStackTrace();
            }
        
        
        
    }
}

