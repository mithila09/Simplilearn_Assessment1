package com.simplilearn.assessment1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class abc {

	
public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	String str;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("----Welcome to LockedMe.com-----");
	System.out.println("---Author(Developed By) : Mithila Fursule----");
	
	RetrieveFile rf = new RetrieveFile();
	AddFile af = new AddFile();
	DeleteFile df = new DeleteFile();
	SearchFile sf = new SearchFile();
	
	while(true) {
		System.out.println("*********************************");
		System.out.println("Select any option listed below.");
		System.out.println("1. Return current file names");
		System.out.println("2. Return details of file");
		System.out.println("   a. Add file in existing directory");
		System.out.println("   b. Delete file from existing directory");
		System.out.println("   c. Search file in main directory");
		System.out.println("   d. Return to main menue");
		System.out.println("3. Exit application \n");
		
		System.out.println("Enter your choice as 1/2/3");
		str = sc.next();
		
		if(str.equals("1")) {
			//returning current files names in root directory
			System.out.println("Enter root directory name: ");
			String dir = sc.next();
			File file = new File(dir);
			if(file.isDirectory()) {
				rf.fetchFiles(file);
			}
			else {
				System.out.println("Incorrect directory name");
				break;
			}
		}else if(str.equals("2")) {
			System.out.println("Enter suboption as a/b/c/d");
			String suboption = sc.next();
			
			if(suboption.equals("a")){
			System.out.println("Enter directory path to add file");
			String str1 =sc.next();
			System.out.println("Enter file to be added");
			String str2 = sc.next();
			af.addFile(str1,str2);
			}
			if(suboption.equals("b")){
			System.out.println("Enter directory path to delete file");
			String str3 =sc.next();
			System.out.println("Enter file to be deleted");
			String str4 = sc.next();
			df.deleteFile(str3,str4);
			}
			if(suboption.equals("c")){
			System.out.println("Enter directory path to search file");
			String str5 =sc.next();
			System.out.println("Enter file name to be searched");
			String str6 = sc.next();
			sf.searchFile(str5,str6);
			}
			if(suboption.equals("d")){
			}
		}else if(str.equals("3"))
		{
			break;
		}
	}
	sc.close();
}
}
