package week1.day1;

public class MyCar {

	public static void main(String[] args) {
		Car myCar = new Car();
		float myMile = myCar.mileage(65);
		System.out.println(myMile);
		
//		System.out.println(myCar.mileage(65));
		String color = myCar.getColor();
		System.out.println(color);
		myCar.applyBrake();
		int num = myCar.getCarNumber();
		System.out.println(num);
		System.out.println(myCar.brand);
	}

}








