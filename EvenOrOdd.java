package AssignmentDay5;
/**
 * Even or odd
 * 
 * @author : Snehal Nakade
 *
 */

import java.util.Scanner;

import Utility.Util;

public class EvenOrOdd {
	public static void main(String[] args) {
		System.out.print("Enter any number : ");
		Scanner sc =new Scanner(System.in);
		int Number= sc.nextInt();
    
		String CheckEvenOdd =Util.Checkevenodd(Number);
		System.out.println(CheckEvenOdd);
    }
}
