package assignment_8;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
	
	System.out.println("enter two numbers");
	
	plus();

	}

	public static void plus() {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int res = num1+num2;
		System.out.println("result is "+res);
	}

}
