package testproject;

public class SwitchExample {

	public static void main(String[] args) {
		String monthName="";
		int month=3;
		int year=2000;
		int ndays=0;
		
		switch (month) {
		case 1: monthName = "January";
		        break;
		case 2: monthName = "Feb";
                break;
		case 3: monthName = "March";
                break;
        default:   
        	    System.out.println("Invalid number");
        	       	    
           
                
                
		}
		System.out.println(monthName);
	}

}
