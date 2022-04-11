package AssignmentDay5;
import java.util.Scanner;

import Utility.Util;
public class FlipCoin {
	public static void main(String[] args) {
		int CountHead=0;
		int CountTail=0;
		float  Result;
		Scanner sc =new Scanner(System.in);
		System.out.print("The number of times to Flip Coin : ");
		
		double UserValue=sc.nextDouble();
		for(int i=1;i<=UserValue;i++) {
		//Result =(float)(Math.random());
		 Result = (float)Util.random();
		 //System.out.print("Random number is " +Result);
				
		 if(Result<0.5) {				 
			CountTail=CountTail+1; 		 
				 }
		 else {
			 CountHead=CountHead+1;
			 }	 
	}				 
		System.out.println(" head won " +CountHead + " times");			
		float HeadPercentage=  (float)((CountHead / UserValue) * 100);	
		System.out.println(" Tail won " +CountTail + " times");
		float  TailPercentage=  (float)((CountTail / UserValue) * 100);
		System.out.println(" Head percentage is : " +HeadPercentage);
		System.out.println(" Tail percentage is : " +TailPercentage);
		}
}