package AssignmentDay5;
import java.util.Scanner;

public class PrimeFactor {
	
		public static void main(String[] args) {
	        System.out.println("Prime factors program");
	        System.out.println("Enter number:");
	        Scanner sc =new Scanner(System.in);
	       int n= sc.nextInt();
	        if (n > 0)  {
	        System.out.println("Prime factors of :" + n + "are :");
	            for (int i = 2; i <= n; i++) {
	                while (n % i == 0) {
	                    System.out.println(i);
	                    n = n / i;
	                }
	            }
	        }
	        else {
	            System.out.println("Input is invalid ");
	        }
	    }
}