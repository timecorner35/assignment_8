package assignment_8;

public class Q14 {

public static void main(String[] args) {
	   
		
		System.out.println(threeLocks(true, true, false));
	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {
	    return ((a&&b)||c==true) ? true : false;
	    
	    
	  }//end threeLocks
	
}
