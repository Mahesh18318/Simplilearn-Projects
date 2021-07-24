package project;
import java.io.*;
import java.util.Scanner;

public class LockedMeMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("         Welcome to Locked Me ! ");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("    Developed by Mahesh Shivaji Mane");
		System.out.println("");
		
		// using Loop to perform the various operations
		
		while(true) {
			System.out.println(" ");
			System.out.println("press yes to continue to operations, press no to exit");
			String ask = scanner.nextLine();
			
			//Applying condition using if else for yes or no
			
			if(ask.equals("yes")) {
				//number of operations that can be performed
			System.out.println("Enter c: create file");
			System.out.println("Enter r: read file");
			System.out.println("Enter d: delete file");
			System.out.println("Enter l: list of files ");
			System.out.println("Enter e: to exit");
			}else if(ask.equals("no")) {
				System.out.println("You have successfully exited the application");
				break;
			}
			
			// Creating object operation and its instances to perform various operations 
			
			String command = scanner.nextLine();
			Operations operation= new Operations();
			//create file
			if(command.equals("c")) {
				operation.createFile();
		    //read file
			}else if(command.equals("r")) {
				try {
				operation.readFile();
				} catch (FileNotFoundException e) {
					System.out.println("File doesn't exists");
				}
		     // Delete file
			}else if(command.equals("d")) {
				operation.deleteFile();
				
		    // List file
			}else if(command.equals("l")) {
				operation.listFile();
		    // Exit the application
			}else if(command.equals("e")) {
				System.out.println("You have successfully exited the application");
				break;
			   }
	  }
	}
	
}
