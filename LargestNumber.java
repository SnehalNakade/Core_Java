package AssignmentDay5;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		int first, second, Third = 0; 		
	    Scanner sc = new Scanner(System.in);  
		//reading input from the user  
		System.out.println("Enter the first number:");  
		first = sc.nextInt();  
		System.out.println("Enter the second number:");  
		second = sc.nextInt();  
		System.out.println("Enter the third number:");  
		Third = sc.nextInt();  
		//comparing a and b and storing the largest number in a temp variable
		 int largest, temp; 
		temp=first>second?first:second;  
		//comparing the temp variable with c and storing the result in the variable  
		largest=temp>Third?temp:Third;
		//prints the largest number  
		System.out.println("The largest number is: "+largest);  

		}
}