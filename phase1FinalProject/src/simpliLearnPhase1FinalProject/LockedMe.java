package simpliLearnPhase1FinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe 

{
	static final String projectFilesPath="E:\\java\\finalproject";
	
	public static void displayMenu()
	{
		System.out.println(" ******************************************");
		System.out.println("\t Welcome to LockedMe.com source app");
		System.out.println("\t. Developed by : Raghavendra H ");
		System.out.println(" ******************************************");
		System.out.println("\t. Display all Files");
		System.out.println("\t. Add a new file");
		System.out.println("\t. Delete a file");
		System.out.println("\t. Search file");
		System.out.println("\t. exit");
		System.out.println(" ******************************************");
	}

	public static void getAllFiles()
	{
		File folder = new File(projectFilesPath);
		File[] listOfFiles = folder.listFiles();
		
		if(listOfFiles.length>0)
		{
			System.out.println("Files List Is Below:\n");
			for(var l:listOfFiles)
			{
				System.out.println(l.getName());
			}
		}
		else
		{
			System.out.println("The Folder is Empty");
		
		}
				
	}

	public static void createFiles() {
		{
			try
		{
		//variable declaration
		Scanner obj = new Scanner(System.in);
		String fileName;
		
		//read file name from user
		System.out.println("Enter File Name:");
		fileName=obj.nextLine();
		
		int linesCount;
		System.out.println("Eneter how many lines in the file");
		linesCount= Integer.parseInt(obj.nextLine());
	
		FileWriter fw = new FileWriter(projectFilesPath +"\\"+fileName+".txt");
		
		//read line by line from user
		for(int i=1; i<=linesCount;i++)
			
		{
			System.out.println("enter file line");
			fw.write(obj.nextLine()+"\n");
		}
			System.out.println("file created successfully");
			fw.close();
		}
				
		catch(Exception Ex)
		{
						
		}
	}
	}
	
		public static boolean checkFileExists(String fileName) 
		{
			//get all files names into a list
			ArrayList<String> allFilesNames = new ArrayList<String>();
	
	File folder = new File(projectFilesPath);
	
	File[] listOfFiles= folder.listFiles();
	
	if(listOfFiles.length>0)
	{
		//System.out.println("Files list is below");
		for(var l:listOfFiles)
		{
			allFilesNames.add(l.getName());
		}
	}

	File f=new File(projectFilesPath+"\\"+fileName);
	
	
	if(allFilesNames.contains(fileName))
	return true;
	else
		return false;
	}
	
		public static void deleteFiles() {
		{
			try 
			{
				Scanner obj=new Scanner(System.in);
				String fileName;
				System.out.println("Enter file name to be deleted");
				fileName=obj.nextLine();
				File f=new File(projectFilesPath+"\\"+fileName);
				if(checkFileExists(fileName))
					{
						f.delete();
						System.out.println("File deleted succesfully");
					}
					else
					{
						System.out.println("File doesnot exist");
					}
					
				 
				if(f.exists())
		{
			f.delete();
			System.out.println("File deleted succesfully");
		}
		else
		{
			System.out.println("File doesnot exist");
		}
		}
		catch(Exception Ex)
		{
		
			System.out.println("cant delete");
		}
			
		}
		
	}

	public static void searchFiles()
	{
		try
		{
			Scanner obj=new Scanner (System.in);
			String fileName;
			
			System.out.println("Enter the file name to be searched");
			fileName=obj.nextLine();
			File f=new File(projectFilesPath+"\\"+fileName);
		
		//if(allFilesNames.contains(fileName))
			if(checkFileExists(fileName))
		{
			System.out.println("File is available");
		}
		
		else
		{
			System.out.println("File is not available");
		}
		
		}
		catch(Exception Ex)
		{
		
	}

	}

	public static void exit()
	{	
		
	}
}
