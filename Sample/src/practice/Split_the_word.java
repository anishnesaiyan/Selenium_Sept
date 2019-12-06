package practice;

import java.util.Scanner;

public class Split_the_word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word");
		
		String s =sc.nextLine();
		
		String[] split = s.split(" ");
		System.out.println("The splited Strings are as follows: ");
		for(String sp:split)
		{
			System.out.println(sp);
		}
	
	
	
	}

}
