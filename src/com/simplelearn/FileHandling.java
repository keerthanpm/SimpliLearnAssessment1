package com.simplelearn;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileHandling {
	public static void createMainFolderIfNotPresent(String folderName) {
		File file = new File(folderName);

		// If file doesn't exist, create the main folder
		try {
		if (!file.exists()) {
			file.mkdirs();
		}
		}
		catch(Exception e) {
		      e.getStackTrace();
		}
	}

	public static void ascending() {
		
		
		createMainFolderIfNotPresent("menu");  
		File file = new File("menu");
		String[] result;
		try {
		result = file.list();
		List<String> list1 = new ArrayList<String>(Arrays.asList(result));
		System.out.println("Files are ordered in ascending");
		if(list1.isEmpty()) {
			System.out.println("\n------No failes are available to display------");
		}
		for(String str:list1) {
			System.out.println(str);
		}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		finally {
		
		System.out.println("\nReturning to Initial menu\n");
		
		
		}
	}
	public static void addFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file name to add in the directory menu");
		String fileName = sc.nextLine();
		File fileadd = new File("menu/"+fileName);

	    try {

	    createMainFolderIfNotPresent("menu");  
	      boolean value = fileadd.createNewFile();
	      if (value) {
	        System.out.println("File "+fileName+" is created.");
	      }
	      else {
	        System.out.println("The file "+fileName+ " already exists.");

	      }
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	    finally{
			System.out.println();
			System.out.println("--------------Returning to Oprations Menu-------------------");
		}
	}

	public static void deleteFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a file to remove from current directory");
		String delFile = sc.nextLine();
		File filedel = new File("menu/"+delFile);
		boolean value = filedel.delete();
		try {
			if(value) {
				System.out.println("The file "+delFile+ " deleted successfully.");
			}
			else {
				System.out.println("There is no such file available in current directory to delete");
			}
		}
		
		catch(Exception e) {
			      e.getStackTrace();
			}
		finally{
			System.out.println();
			System.out.println("--------------Returning to Secondary Menu-------------------");
		}
			
		}

	public static void searchFile() {
		// TODO Auto-generated method stub
		File directory = new File("menu");
		  
        // store all names with same name
        
        String[] flist = directory.list();
        System.out.println("Enter a file name to search in menu folder");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        int flag = 0;
        try {
        if (flist == null) {
            System.out.println("Empty directory.");
        }
        else {
  
            // Linear search in the array
            for (int i = 0; i < flist.length; i++) {
                String filename = flist[i];
                if (filename.equals(search)) {
                    System.out.println("File "+filename + " found");
                    flag = 1;
                }
            }
        }
  
        if (flag == 0) {
            System.out.println("File " +search+ " Not Found");
        }
    
	}catch(Exception e) {
	      e.getStackTrace();
	}
    finally{
	System.out.println();
	System.out.println("--------------Returning to Secondary Menu-------------------");
}
		
	}
		
    
		
}		
	
		
