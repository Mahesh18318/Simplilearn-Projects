package project;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Operations {

	public BufferedOutputStream wstream;
	public Scanner scanner = new Scanner(System.in);
    public BufferedInputStream  rstream;
   
	//Creation of the file and Entering Content into the file
    
	public void createFile() {
		
		System.out.println("Enter file name");
		String fileName = scanner.nextLine();
		String path = "D:\\mahesh data\\LockedMe"+fileName;
		try {
			wstream = new BufferedOutputStream(new FileOutputStream(path));
			System.out.println("Enter Content");
			String content = scanner.nextLine();
			String a = content;
			wstream.write(a.getBytes());
			System.out.println("sucessfully created file and added content");
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, folder doesn't exist. Try again");
		} catch (IOException e) {
		  System.out.println("Something went wrong, try again");
		}finally {
			if(wstream != null) {
				try {
					wstream.close();
				} catch (IOException e) {
					System.out.println("Something went wrong, try again");
				}
			}
		}
	}
	
	//Reading the Already Created File
	
	public void readFile() throws FileNotFoundException {
		System.out.println("Enter file name");
		String fileName = scanner.nextLine();
		String path = "D:\\\\\\\\mahesh data\\\\\\\\LockedMe"+fileName;
	    File file = new File(path);
		
		try (Scanner sc = new Scanner(file)) {
			while(sc.hasNextLine()) {
				   System.out.print(sc.nextLine());
			   }
			System.out.println(" ");
			sc.close();
		}
	}
	
	// Deleting the User Specified file 
	
	public void deleteFile() {
		System.out.println("Enter file name");
		String fileName = scanner.nextLine();
		String path = "D:\\\\mahesh data\\\\LockedMe"+fileName;
		File file = new File(path);
		
		boolean a = file.delete();
		if(a) {
			System.out.println("file deleted Sucessfully");
		}else {
			System.out.println("file not found");
		}
		
	}
	
	// Listing all the files in the Directory
	
	public void listFile() {
		//Creating a File object for directory
	      File directoryPath = new File("D:\\mahesh data\\LockedMe");
	      //List of all files and directories
	      File filesList[] = directoryPath.listFiles();
	      System.out.println("List of files in the directory:");
	      System.out.println(" ");
	      for(File file : filesList) {
	         System.out.println("File name: "+file.getName());
	      }
	}
	
}