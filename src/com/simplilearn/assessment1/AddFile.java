package com.simplilearn.assessment1;

import java.io.File;
import java.io.IOException;

public class AddFile {

	// this function will add file in given directory
	public void addFile(String dir,String f) throws IOException {
		File fileDir = new File(dir);
		if(fileDir.isDirectory() && !f.isEmpty() ) {
			File file = new File( dir+"\\"+f);
		if (file.exists()) {
			System.out.println("File already exists");
		}
		else {
			file.createNewFile();
			System.out.println("File Created :" +file.toString());
		}
		}
		else {
			System.out.println("Invalid directory name or wrong file name");
		}
	}
}
