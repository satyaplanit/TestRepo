package testproject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Simple {

	public static void main(String[] args) {
		//Single in comments - variables
		String str = "test123";
		int length= str.length();
		int loc = str.indexOf("123");
		int loc1=str.indexOf("t");
		System.out.println(length);
		System.out.println(loc);
		System.out.println(loc1);
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d = new Date();
		System.out.println(d);
		System.out.println(dateFormat.format(d));
	/*	ArrayList <String> al = new ArrayList <String> ();
		al.add("abc");
		al.add("def");
		al.add("ghi");
		
		for (String s :al)
		{
			System.out.println(s);
		}
		al.remove(2);
		for (String s :al)
		{
			System.out.println(s);
		}
	 String elementGet=al.get(1);
		System.out.println(elementGet);*/
		int a=10;
		int b=2;
		int c=a+b;
				boolean bv=false;
		char ch='a';
		char uniChar='\u03A9';//unicode
		char testChar='a'+1;
		int myInt=10;
		float fOne=11.2f;
		float fTwo=myInt;
		//double d= 0.3-0.1;
		/* multi line comments
		 * Displaying sum of a and b
		 */
		/*System.out.println(c);
		a++;
		b--;
		//System.out.println(bv);
		//System.out.println(ch);
		//System.out.println(ch+1);
		//System.out.println(uniChar);
		//System.out.println(testChar);
		//System.out.println(myInt);
		//System.out.println(fOne);
		//System.out.println(fTwo);
		//System.out.println(++a);// increment operator
		//System.out.println(b);// decrement operator
		//a +=10;
		System.out.println(a);
		b -=5;
		System.out.println(b);
		System.out.println(d);
		*/
	}

	

}
