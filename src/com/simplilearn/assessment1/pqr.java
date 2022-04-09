package com.simplilearn.assessment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class pqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchFile sf = new SearchFile();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter directory path to search file");
		String str5 =sc.next();
		System.out.println("Enter file name to be searched");
		String str6 = sc.next();
		// searching file in given directory
		sf.searchFile(str5,str6);
	}
	
	
		public void searchFile(String dirName, String fName) throws FileNotFoundException {
			File folder = new File(dirName);
			
			if(folder.isDirectory()) {
				String[] listOfFiles = folder.list();
			if(listOfFiles!=null) {
				for(int i=0;i<listOfFiles.length;i++) {
					String fileName = listOfFiles[i];
					if(fileName.equals(fName)) {
						System.out.println(fName+" file found");
						return;
					}
				}
				
			}
			else{
				System.out.println(dirName + "  Directory is empty");
			}
		}
	}	

	

}
