package com.simplilearn.assessment1;

import java.io.File;

public class SearchFile {

	//this function will check and search file in given directory
		public void searchFile(String dirName, String fName) {
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
				System.out.println(fName +" file not found");
				return;
			}
			else{
				System.out.println(dirName + "  Directory is empty");
			}
		}
			else {
				System.out.println("Invalid directory name");
			}
	}	
}
