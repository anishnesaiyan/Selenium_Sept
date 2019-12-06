package number_Programs;

import java.util.Scanner;

public class Sum_of_Individual_Digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int ID=0;
		int temp=0;
		while(n!=0)
		{
			ID= n%10;
			temp=ID+temp;
			n=n/10;
			
		}
		System.out.println("The sum of individual digit is "+ temp);
		

	}

}
