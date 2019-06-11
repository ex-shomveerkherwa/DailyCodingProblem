package com.hom.som.Utilities;

public class DivideWithoutDivision {

	public static void main(String[] args) {
		int a=2;
		int b=0;
		int result = divide(a,b);
		System.out.println(a+"/"+b+" = "+result);
	}

	public static int divide(int num1, int num2) {
		
		int count = 0;
		boolean isNegative = false;
		
		if(num2 == 0)
			return Integer.MAX_VALUE;
		
		if(num1 < 0) {
			num1= - num1;
			if(num2 < 0) {
				num2=-num2;
			}else {
				isNegative=true;
			}
		}
			
		if(num2 < 0) {
			num2=-num2;
			isNegative=true;
		}
		
		while(num1 >= num2) {
			num1 = num1-num2;
			
			if(num1 >= 0)
				count++;
		}
		
		if(isNegative) {
			count = - count;
		}
		
		return count;
	}

}
