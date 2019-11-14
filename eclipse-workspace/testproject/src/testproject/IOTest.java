package testproject;

import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		Scanner userInput= null;
		try {		
		userInput=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String firstName = userInput.next();
		System.out.println("Welcome "+firstName);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        finally {
        	userInput.close();
        }
        
	}

}
