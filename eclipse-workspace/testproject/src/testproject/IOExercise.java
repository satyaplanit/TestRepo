package testproject;

import java.util.Scanner;

public class IOExercise {

	public static void main(String[] args) {
		IOExercise io=new IOExercise();
		int i=0;
		i=io.inputNum();
		System.out.println(i);
		for(int j=0;j<i;j++)
		{
			System.out.println(j);
		}
	}
    public int inputNum() {
    	Scanner userInput= null;
		try {		
		userInput=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num=0;
		num=userInput.nextInt();
		return num;
		}
		finally {
        	userInput.close();
        }
        
    }
}
