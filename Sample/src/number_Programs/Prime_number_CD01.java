package number_Programs;

import java.util.Scanner;

public class Prime_number_CD01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range ==> ");
		int n =sc.nextInt();
		String concat ="";
		
		for(int i=2; i<n;i++)
		{
			
		boolean primeflag= check_Prime(i);
		
			if(primeflag)
			{
				concat = concat+i+" ";
			}
		}
		System.out.println(concat);
		

	}
//Method to find whether the number is odd or even
	static boolean check_Prime(int input)
	{
		int remainder;
		for(int i=2; i<=input/2;i++)
		{
			
			remainder= input%2;
			if(remainder==0)
			{
				return false;
			}
		}
		return true;
	}
}
