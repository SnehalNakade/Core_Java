package AssignmentDay5;

import java.util.Scanner;

import Utility.Util;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter between 1 to 32 numbers : ");
		double uservalue=sc.nextDouble();
		for(int i=1;i<=uservalue;i++) {
		if(uservalue<32)
         {
			 result=Util.power(2, i);
             System.out.println(2 + " " +" to power of " +i+ "=" + result);
         }
	}
		 if (((result % 4 == 0) && (result % 100!= 0)) || (result%400 == 0)) {
	         System.out.println( +result + "year is a leap year");
		 }
	         
	      else {
	         System.out.println( + result + " year is not a leap year");
	      }
	   }
		
		
	}
