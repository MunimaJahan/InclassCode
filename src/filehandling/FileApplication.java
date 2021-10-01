package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename="MyFile.txt";
		CreateFile(filename);
		WriteToFile(filename);
		ReadFile(filename);
	}
	public static void CreateFile(String filename) {
		try {
			File myObj = new File(filename);
			// File myfile=new File("MyFile.txt");

			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			//e.printStackTrace();
		}
	}

	public static void WriteToFile(String filename) {
		try {
		      
		    FileWriter myWriter = new FileWriter(filename);
		      
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  
	}
	
	public static void ReadFile(String filename) {
		try {
		      File myObj = new File(filename);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      //e.printStackTrace();
		    }
		  
	}

}
