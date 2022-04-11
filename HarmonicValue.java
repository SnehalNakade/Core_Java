package AssignmentDay5;
import java.util.Scanner;


public class HarmonicValue {
	public static void main(String arg[]) {
	double n,i;
	double sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
	n=sc.nextDouble();
	System.out.print("Harmonic number is:");
	for( i=1;i<=n;i++)
	{
		System.out.print("1/" +i +" +");
		sum=sum+(1/i);
	}
	System.out.println("");
	System.out.println("Harmonic value = "+sum);
	}
}