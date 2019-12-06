package number_Programs;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Odd_Even {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int ab = sc.nextInt();
		
		method1(ab);
		method2(ab);
		method3(ab);
		

	}

	static void method1(int ab)
	{
		if(ab%2==0)
			System.out.println("Modulous method--->"+ab +" Number is even");
		else
			System.out.println("Modulous method--->"+ab +" Number is odd");
	}
	static void method2(int b)
	{
		if((b&1)==0)
			System.out.println("Operator method--->"+b +" Number is even");
		else
			System.out.println("Operator method--->"+b +" Number is odd");
		
	}
	static void method3(int b)
	{
		if((b/2*2==b))
			System.out.println("without modulus method--->"+b +" Number is even");
		else
			System.out.println("without modulus method--->"+b +" Number is odd");
		
	}
}
