package simpliLearnPhase1FinalProject;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args)
 {
		Scanner obj = new Scanner(System.in);
		
		LockedMe.displayMenu();
		
		System.out.println("Enter Your Choice:");
	    int ch = Integer.parseInt(obj.nextLine());
		
		switch(ch)
		{
		case 1 : LockedMe.getAllFiles();
				break;
		case 2 : LockedMe.createFiles();
				break;
		case 3 : LockedMe.deleteFiles();
				break;
		case 4 : LockedMe.searchFiles();
				break;
		case 5 : LockedMe.exit();
				 break;
		default:System.out.println("Invalid Option");
		}
		
		while(ch>0);
		
		obj.next();
		obj.close();
	}
	
}
