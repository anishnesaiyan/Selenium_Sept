package number_Programs;

import java.util.Scanner;

public class Sum_array_CD02 {

	//Find the sum of numbers in an array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the array size");
		int size= sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the values in the array:");
		int sum=0;
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		
		System.out.println("The sum of values in array is:" +sum);

	}

}
