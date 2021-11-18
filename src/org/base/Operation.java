package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Operation {
	 public static void main(String[] args) throws IOException  {
	 
		 File f =new File("C:\\Users\\acer\\Documents\\summary.pdf");
		 File opf = new File("C:\\Users\\acer\\Documents\\summary-copy.pdf");
		 
		FileInputStream  fileInputStream = null;
	    FileOutputStream fileOutputStream = null;
	 try {
		fileInputStream = new FileInputStream(f);
		 fileOutputStream = new FileOutputStream(opf);
		 
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	}
	 int i=0;
	try {
		 while((i=fileInputStream.read())!=-1){
			fileOutputStream.write(i);
		 }
	} catch (IOException e) {
	  e.printStackTrace();
	}
	 
	 finally {
		if((fileInputStream != null)) {
			fileOutputStream.close();
		}
		if(( fileOutputStream !=null)) {
			fileOutputStream.close();
		}
	 }
	 
	 
	 
	 
	 
	 
	 }
	 }