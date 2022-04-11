package AssignmentDay5;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		
		  int first, second, temp; // x and y are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of first and second number :");  
	      first = sc.nextInt();  
	       second = sc.nextInt();  
	       System.out.println("Before swapping: "+first +"  "+ second);  
	       temp = first;  
	       first = second;  
	       second = temp;  
	       System.out.println("After swapping: "+first +"   " + second);  
	       System.out.println( );  
	    }    
}