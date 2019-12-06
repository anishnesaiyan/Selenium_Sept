package number_Programs;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the given number: ");
		int n=sc.nextInt();
		int m=n/2; // For iterating
		int flag=0;
		
		if(n==0 || n==1)
		{
			System.out.println(n+ " is not a prime number");
		}
		
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println(n+ " is not a prime number");
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println(n+ " is a prime number");
			
		}
			

	}

}
