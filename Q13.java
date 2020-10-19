package assignment_8;

public class Q13 {

	public static void main(String[] args) {
		   
		// waterTax(units);
		System.out.println(waterTax(50));
	}

	public static double waterTax(double units) {
		double bill;
		bill = (units>50)? (units>=100)? (units>=150)? (100+(units*0.9)) : (50+(units*0.9)) : (units*0.9) : units*0.6;
		return bill;
}
	
}