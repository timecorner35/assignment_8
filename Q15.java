package assignment_8;

public class Q15 {

	public static void main(String[] args) {
	
System.out.println(validateTask(true,5,3));
	}

	public static boolean validateTask(boolean b, int i, int j) {
		if(b&&(j==i-1))return true;
		else return false;
		
	}

}
