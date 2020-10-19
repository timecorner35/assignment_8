package assignment_8;
import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num");
		int number = scan.nextInt();
	System.out.println(isPalindrome(number));

	}

	public static boolean isPalindrome(int num) {
		int remainder , temp;
		int sum = 0;
		temp=num;    
		  while(num>0){    
		   remainder=num%10;  //getting remainder  
		   sum=(sum*10)+remainder;    
		   num=num/10;    
		  }    
		  if (sum==temp) return true;
		  else return false;

		
		
	}

}
