package testproject;

public class NestedLoops {

	public static void main(String[] args) {
		for(int firstNum=1;firstNum<13;firstNum++) {
			for(int secNum=1;secNum<11;secNum++) {
				int result = firstNum * secNum;
				System.out.println(firstNum + "*" +secNum + "="+result);
			}
		}
	}

}
