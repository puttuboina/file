package org.base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Operation2 {
	
	public static void main(String[] args) throws IOException {
	
	File f = new File("F:\\java\\package\\class.txt");
	
	boolean makeone = f.mkdir(); 
	System.out.println(makeone);
	
	boolean newone = f.createNewFile();
	System.out.println(newone);
	
	if(newone) {
		System.out.println("file is created..");
	}
	else {
		System.out.println("file is already exists....");
	}
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the filename with path location:");
		String FileName = sc.nextLine();
		
		FileOutputStream fof = new FileOutputStream(FileName, true);
		
		System.out.println("Enter the content:");
		String content = sc.nextLine();
		byte b[] = content.getBytes();
		System.out.print("nextLine");
				
		fof.write(b);
		fof.close();
		System.out.println("file is saved in the given location path");
	
             
	
	
	
	
	}
	}

		


