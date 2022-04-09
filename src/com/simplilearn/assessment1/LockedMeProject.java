package com.simplilearn.assessment1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LockedMeProject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Welcome to LockedMe.com-----");
		System.out.println("---Author(Developed By) : Mithila Fursule---\n \n");
		
		RetrieveFile rf = new RetrieveFile();
		AddFile af = new AddFile();
		DeleteFile df = new DeleteFile();
		SearchFile sf = new SearchFile();
		
		while(true) {
			// Displaying below options to user
			System.out.println("*********************************************************************************");
			System.out.println("*********************************************************************************");
			System.out.println("Select any option listed below.");
			System.out.println("1. Return current file names");
			System.out.println("2. Return details of file");
			System.out.println("   a. Add file in existing directory");
			System.out.println("   b. Delete file from existing directory");
			System.out.println("   c. Search file in main directory");
			System.out.println("   d. Return to main menu");
			System.out.println("3. Exit application \n");
			
			// asking user to enter values
			System.out.println("Enter your choice as 1/2/3");
			str = sc.next();
			
			if(str.equals("1")) {
				//returning current files names in root directory
				System.out.println("Enter root directory name: ");
				String dir = sc.next();
				rf.fetchFiles(dir);
				
			}else if(str.equals("2")) {
				System.out.println("Enter suboption as a/b/c/d");
				String suboption = sc.next();
				
				if(suboption.equals("d")) {
					
				}
				else {
				switch(suboption) {
				case "a" : System.out.println("Enter directory path to add file");
							String str1 =sc.next();
							System.out.println("Enter file to be added");
							String str2 = sc.next();
							// adding file in given directory
							af.addFile(str1,str2);
							break;
				case "b" : 	System.out.println("Enter directory path to delete file");
							String str3 =sc.next();
							System.out.println("Files in current directory are as below: ");
							boolean flag = rf.fetchFiles(str3);
							if(flag) {
								System.out.println("Enter file to be deleted");
								String str4 = sc.next();
								// deleting file from given directory
								df.deleteFile(str3,str4);
								}
							break;	
				case "c" : System.out.println("Enter directory path to search file");
							String str5 =sc.next();
							System.out.println("Enter file name to be searched");
							String str6 = sc.next();
							// searching file in given directory
							sf.searchFile(str5,str6);
							break;
				default :  System.out.println("\n switch Please select correct option \n");
							break;
				}
				}
			}else if(str.equals("3"))
			{
				// Exiting program.
				System.out.println("Closing Application");
				System.exit(0);
			}
			else {
				System.out.println("\n  else Please select correct option  \n");
			}
		}
	}
	
}