package com.brigdelab.utility;
import java.util.Stack;
import java.lang.String;

public class Util {
	
// Power of Two
		public static int power(int a , int b ) {
		int X=(int) Math.pow(a,b);
		return X;
		}
	
// FLipCOin		
public static double random() {
//	 TODO Auto-generated method stub
		 double random = Math.random();
			
			return random;
	}
		
		
		
//		public static float random() {
//			
//			  float random =(float)(Math.random());
//			
//			return random;
//			}
//
		
//LeapYr OR NOT LeapYr

	public static String  CheckLeapYear(int year) {
		String LeapYr="";
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			LeapYr =year + "year is a leap year";
		}
	     else {
	          LeapYr = " year is not a leap year";
	  }
		
		return LeapYr;
	}
// Vowel OR Consonant
	public static String  Checkalphabet(char ch) {
		String Alphabet="";
		 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
			 Alphabet=ch + " is vowel";
		 }
	     else {
	    	 Alphabet=ch + " is consonant";
		}
		return Alphabet;
	}
// Even OR ODD
	public static String  Checkevenodd(int Number) {
		String Checkevenodd="";
		 if(Number % 2 ==0) {
			 Checkevenodd= Number+ " Number is even  ";
		    }
		    else 
		    	Checkevenodd=  Number+ " Number is odd  ";
		return Checkevenodd;
	}
	
// Remainder And Quotient 
	public static int  Quotient(int dividend,int divisor) {
	    int quotient = dividend / divisor;
		return quotient;
	}
	public static int  Remainder(int dividend,int divisor) {
		int remainder = dividend % divisor;
		return remainder;
	}
//	// logical = primenumber
//	
//
//	public static void primeNumber(int num) {
//		// TODO Auto-generated method stub
//		public static void primeFactor(int num) {
//			if (num > 0) {
//				System.out.println("Prime factors of " + num + "are :");
//				for (int i = 2; i <= num; i++) {
//					while (num % i == 0) {
//						System.out.println(i);
//						num = num / i;
//					}
//				}
//			} else {
//				System.out.println("Input is invalid ");
//			}
//		}
//	}
}