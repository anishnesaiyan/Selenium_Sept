package number_Programs;

import java.text.DecimalFormat;

public class Integer_and_Fract_part {

	
	/// to round off decimal values
	static DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		double d=  12.69;
		int b=(int)d;
		double c= d-b;
		df.format(c);
		System.out.println("Integer part is :"+ b);
		System.out.println("Integer part is :"+ df.format(c));
	}

}
