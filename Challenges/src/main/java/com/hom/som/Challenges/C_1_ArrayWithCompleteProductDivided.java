package com.hom.som.Challenges;

import java.util.Arrays;

import com.hom.som.Utilities.DivideWithoutDivision;

/*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/
public class C_1_ArrayWithCompleteProductDivided {

	public static void main(String[] args) {

		int[] input = new int[] {1,2,0,4,5};
		int[] output = new int[input.length];
		
		System.out.println(Arrays.toString(input));
		
		computeOutput(input,output);
		
		System.out.println(Arrays.toString(output));
	}

	private static void computeOutput(int[] input, int[] output) {
		int totalProduct = getProductOfCompleteArray(input,-1);
		System.out.println(totalProduct);
		for(int i=0;i<input.length;i++) {
		output[i]= (input[i] == 0 )? getProductWithoutCurrent(input,i) : DivideWithoutDivision.divide(totalProduct, input[i]);
		}
			
	}

	private static int getProductWithoutCurrent(int[] input ,int i) {
		return getProductOfCompleteArray(input,i);
	}

	private static int getProductOfCompleteArray(int[] input , int skip) {
		int product=1;
		
		for(int i=0;i<input.length;i++) {
			if(i == skip)
				continue;
			product=product*input[i];
		}
		return product;
	}

}
