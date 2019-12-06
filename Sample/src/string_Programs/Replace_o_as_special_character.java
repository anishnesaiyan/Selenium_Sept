package string_Programs;

public class Replace_o_as_special_character {

	public static void main(String[] args) {
		
		String s= "Tomorrowowow"; //input
		String star ="*"; //* variable for replacing
		String concat=""; //Temp variable for concatenation
		String[] split = s.split("");
		
		for (int i = 0; i < s.length(); i++) 
		{
			//For replacing 0 as *
			if(split[i].equals("o"))
				{
				
				split[i]=split[i].replace("o", star);
				
				star=star+"*";
				
				System.out.println(split[i]);
				
				}
			// Concatenation
			concat = concat+split[i];
		}
       
       System.out.println(concat);
       
	}


}
