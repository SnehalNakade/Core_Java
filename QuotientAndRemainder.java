package AssignmentDay5;

import java.util.Scanner;
import Utility.Util;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		System.out.println("Enter dividend number: ");
		Scanner sc =new Scanner(System.in);
		int dividend=  sc.nextInt();
		
		System.out.println("Enter divisior number: ");
		Scanner A =new Scanner(System.in);
		int divisor= A.nextInt();
		 
	    int quotient =Util.Quotient(dividend, divisor);
	    int remainder =Util.Remainder(dividend, divisor);

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	}
}