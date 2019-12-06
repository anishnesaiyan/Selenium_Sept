package number_Programs;

import java.util.Scanner;

public class CD04_1 {
	
	public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	for(int i=a;i<=b;i++)
	{
		if(i%3==0)
			System.out.print("Fizz ");
		else if(i%5==0)
			System.out.print("Bizz ");
		else if(i%3==0 && i%5==0 )
			System.out.print("Fizz Buzz ");
		else
			System.out.print(i+" ");
		
	}
	
	}

}
