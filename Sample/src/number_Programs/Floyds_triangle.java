package number_Programs;

import java.util.Scanner;

public class Floyds_triangle {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		floyds(rows);
	}
	
	static void floyds(int row)
	{
		int num = 1;
		for(int i=1; i<=row;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
			
			
		}
		
		
	}

}
