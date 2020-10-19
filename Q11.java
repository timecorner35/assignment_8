package assignment_8;

public class Q11 {
	public static void main(String[] args) {
		   
		String res =c_profits(25, 15);
		System.out.println(res);
	}

	public static String c_profits (int buyPrice,int sellPrice) {
	    return (sellPrice-buyPrice>=0) ?(sellPrice>buyPrice)? "profit" : "no loss" : "loss";
	   
	   
	   
	}
  
}

