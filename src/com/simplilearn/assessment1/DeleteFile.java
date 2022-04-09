package com.simplilearn.assessment1;

import java.io.File;

public class DeleteFile {

	//this function will check and delete file from given directory
	public void deleteFile(String dirName, String fName) {
		File fileDir = new File(dirName);
		if(fileDir.isDirectory() && !fName.isEmpty() ) {
			File file = new File( dirName+"\\"+fName);
			
				String[] listOfFiles = fileDir.list();
				if(listOfFiles!=null) {
					for(int i=0;i<listOfFiles.length;i++) {
						String fileName = listOfFiles[i];
						if(fileName.equals(fName)) {
							file.delete();
							System.out.println(file.toString() +" file deleted successfully");
							return;
						}
					}
					System.out.println(fName +" file not found");
					return;
				}
				
			else {
				System.out.println(file.toString()+" file not found");
			}
		}
		else {
			System.out.println("Invalid directory name or wrong file name");
		}
			
	}	
	
}

