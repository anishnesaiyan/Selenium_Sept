package number_Programs;

import java.util.Scanner;

public class ArithmeticOperation_CD03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number1:");
		int num1=sc.nextInt();
		System.out.println("Enter the number2:");
		int num2=sc.nextInt();
		System.out.println("Enter the Options:");
		System.out.println("a. Add");
		System.out.println("b. Sub");
		System.out.println("c. Multiply");
		System.out.println("d. Divide");
		
		String s= sc.next();
		
		switch(s)
		{
		case "Add":
			System.out.println("The sum of two number is :"+(num1+num2));
			break;
		case "Sub":
			System.out.println("The difference of two number is :"+(num1-num2));
			break;
		case "Multiply":
			System.out.println("The multiplication of two number is :"+(num1*num2));
			break;
		case "Divide":
			System.out.println("The Division of two number is :"+(num1/num2));
			break;
		default:
				System.out.println("Invalid selection");
		}
		
	}

}
