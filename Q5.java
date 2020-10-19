package assignment_8;
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int number = scan.nextInt();
		System.out.println(sign(number));

	}

	public static int sign(int num) {
		return  (num>=0) ? (num>0) ? 1 : 0 :-1;
		
		
	}

}
