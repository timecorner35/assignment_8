package assignment_8;

public class Q12 {

	public static void main(String[] args) {
		  
		  boolean res = hamletQuote(true, false);
				System.out.println(res);
			}

			public static boolean hamletQuote(boolean toBe,boolean notToBe) {
			    return (toBe==false&&notToBe==false) ? false : true;
			    
			  }
		}