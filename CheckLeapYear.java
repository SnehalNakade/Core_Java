package AssignmentDay5;

/**
 * @author sneha - Leap year or not
 *
 */
import java.util.Scanner;
import Utility.Util;
public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("please any 4 digit year : ");
		int year =sc.nextInt();
	String Year=Util.CheckLeapYear(year);
	 System.out.println( Year );
//		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
//	         System.out.println( +year + "year is a leap year");
//	      else
//	         System.out.println( + year + " year is not a leap year");
//	   }
//		
	}
}
