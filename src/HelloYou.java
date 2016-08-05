// Import library to use Scanner object
import java.util.Scanner;

// Class to get to know the user
public class HelloYou {

	// Create a class varible of a Scanner object to allow user imput to console
	static Scanner scanner = new  Scanner (System.in);
	// Static class verible to hold string array for user info
	static String []userVars;
	static String []details;

	//method to say farewell to user
	public static void exitApplication() {
		//Message to say farewell to user
		System.out.println("\nThank you for using the SAQ Greeting Application!");
		System.exit(0);

	}

	// This is a method or function 
	public static String[] requestUserInfo(String name, String... details) {
		//
		userVars = new String[details.length];
		//
		System.out.println("I am excited to learn more about you " + name + "!");
		//
		for (int i = 0; i < details.length; i++) {
			//
			System.out.print("Can i get your " + details[i] + ", please? ");
			//
			userVars[i] = scanner.nextLine();
		}
		//
		return details;
	}

	public static void main(String[] args) {
		//
		String name;
		//
		System.out.println("Hello, and welcome to SAQ Selenium Boot Camp");
		//
		System.out.print("Could i please get your name? ");
		//
		name = scanner.nextLine();
		//
		details = requestUserInfo(name,"age","city of residence", "favorite color", "curent mood");	
		//
		outputUserDetails(name);
		//
		exitApplication();
	}

	public static void outputUserDetails(String name) {
	//

		System.out.println("\nWell " + name + ", it seems i have learned enough about you.");
		//
		for (int i = userVars.length - 1; i > 0; i-- ) {
			//
			System.out.println("Your " + details[i] + " is " + userVars[i] + ".");
		}
	}
}
