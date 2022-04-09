package com.simplilearn.assessment1;

import java.io.File;
import java.util.*;

public class RetrieveFile {
	
	// this function will retrieve/fetch files from given directory and then sort them in ascending order.
	public boolean fetchFiles(String dir) {
		File file = new File(dir);
		if(file.isDirectory()) {
		List<String> listFile = Arrays.asList(file.list());
		System.out.println();
		if(listFile.size()>0) {
		Collections.sort(listFile,String.CASE_INSENSITIVE_ORDER);
		System.out.println("---------------------------------------");
		System.out.println("Displaying files in ascending order");
		for(String s:listFile){
			System.out.println(s);
		}
		return true;
		}
		else {
			System.out.println("Empty Directory");
			return false;
		}
	}
		else {
			System.out.println("Incorrect directory name");
			return false;
		}
}
}