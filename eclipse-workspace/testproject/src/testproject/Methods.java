package testproject;

public class Methods {

	public static void main(String[] args) {
		int value = addTwoNum(5,5);
		double d = subTwoNum(7.5, 1.2);
		String s= printString();
		System.out.println(value);
		System.out.println(d);
		System.out.println(s);
		
	}
	
	public static int addTwoNum(int a, int b) {
		int result = a+b;
		return result;
	}
	public static double subTwoNum(double a, double b) {
		double result = a-b;
		return result;
	}
	public static String printString() {
		return "Hello";
	}
}

