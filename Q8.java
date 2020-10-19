package assignment_8;
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num");
	    int num = scan.nextInt();
	    fib(num);
	  }
	  
	  public static void fib(int num){
	    //WRITE YOUR CODE HERE
		  int num1 = 0; int num2 = 1; int res=0;
	    if (num == 1) {res=num1;
	    System.out.println(res);}
	    if (num == 2) {res=num2;
	    System.out.println(res);}
	    
	    int a = 3;
		do {res=num1+num2;
	    	num1=num2;
	    	num2=res;
	    	if(a==num) {System.out.println(res);}
	    	a++;}

	    while(num>=a);
	}

}
