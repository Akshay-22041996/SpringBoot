package com.nt.lamda;

public class MultipleMethodLamdaTest {

	public static void main(String[] args) {
	
		IFuntionalInterface ifi=(x,y)->{
			System.out.println("The result of mul is::"+(x*y));
		};
		
		ifi.mul(5, 5);
	}

}
