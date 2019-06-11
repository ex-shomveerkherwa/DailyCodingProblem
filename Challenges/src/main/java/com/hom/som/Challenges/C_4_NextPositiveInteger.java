package com.hom.som.Challenges;

/*Given an array of integers, find the first missing positive integer in linear time and constant space. 
In other words, find the lowest positive integer that does not exist in the array.
The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.*/

public class C_4_NextPositiveInteger {

	public static void main(String[] args) {
		int[] input1 = new int[] {2, -4, -1, 1};
		System.out.println(getNextInt(input1));
		int[] input2 = new int[] {1,2,3,4,5,7,8,9};
		System.out.println(getNextInt(input2));
		
	}

	//1. Get the negatives on the left of array 
	//2. Make a copy of only positives 
	//3. Go over the numbers, ignore them if they are bigger than the array size , add the numbers negative (-X)
	//   to the index of the array .
	//4. Go over the array and return the first index where you dont encounter a negative number i.e the first ,smallest positive 
	//number that missing
	private static int getNextInt(int[] input) {
		//1.
		int posIndex=segregate(input);
		//2.
		int[] copy = trimInput(input,posIndex);
		//3.
		reverseInputOf(copy);
		//4.
		int missingInt = TraverseCopyUntilPositive(copy);
		return missingInt;
	}

	//return position+1 because index starts from 0 , but actual numbers start from 1 
	private static int TraverseCopyUntilPositive(int[] copy) {
		int position = 0;
		
		for(;position<copy.length;position++) {
			if(copy[position] > 0)
				break;
		}
		return position+1;
	}

	private static void reverseInputOf(int[] copy) {
		for(int i=0;i<copy.length;i++) {
			int val = Math.abs(copy[i]);
			
			if(val-1 < copy.length && copy[val-1] > 0) {
				copy[val-1]= -copy[val-1];
			}
		}
	}

	//new array with lenth of remaining elements
	private static int[] trimInput(int[] input, int posIndex) {
		int[] arr = new int[input.length-posIndex];
		int j=0;
		for(int i=posIndex;i<input.length;i++) {
			arr[j]=input[i];
			j++;
		}
		return arr;
	}

	private static int segregate(int[] input) {
		int j=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]<0) {
				int temp = input[j];
				input[j]=input[i];
				input[i]=temp;
				j++;
			}
		}
		return j;
	}

}
