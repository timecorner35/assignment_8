package assignment_8;
import java.util.*;
public class Q6 {

	public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     
	     next3(num);
	  }
	public  static void next3(int num) {
		
		for(int i = 1; i<=3; i++) {
		System.out.print(num+i+" ");
		}
		
	  
	}}