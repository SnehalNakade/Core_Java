package AssignmentDay5;

import java.util.Scanner;

import Utility.Util;

public class VowelOrConst {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=sc.next( ).charAt(0);
//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
//            System.out.println(ch + " is vowel");
//        else
//            System.out.println(ch + " is consonant");
		
	String CheckAlphabet=	Util.Checkalphabet(ch);

	System.out.println(CheckAlphabet);
	
	}

}
