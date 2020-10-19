package assignment_8;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		cube();

	}

	public static void cube() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num1 = scan.nextInt();
		
		int res = num1*num1*num1;
		System.out.println("result is "+res);
		
	}

}
