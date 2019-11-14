package testproject;

public class TestGrade {

	public static void main(String[] args) {
		int grade = 98;
		if (grade>=90 && grade<=100) {
			System.out.println("Grade A");
		}
		else if (grade>=80 && grade<=89) {
			System.out.println("Grade B");
		}
		else if (grade>=70 && grade<=79) {
			System.out.println("Grade C");
		}
		else if(grade>=60 && grade<=69) {
			System.out.println("Grade D");
		}
		else if(grade<60 && grade>=0)
		 {
			System.out.println("Fail");
		}
		else if(grade>100 || grade<0) {
			System.out.println("Score is invalid, must be bewteen 0 and 100");
		}
			
	}

}
