package com.hom.som.Challenges;

/*Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?
*/
public class C_9_SumOfNonAdjacentNumbers {

	public static void main(String[] args) {
		int[] input = new int[] {5,1,1,5};
		int count = getNonAdjacentSum(input);
		System.out.println(count);
	}

	private static int getNonAdjacentSum(int[] input) {
		int incl = input[0];
		int excl = 0;
		
		for(int i=1;i<input.length;i++) {
			int temp = Math.max(incl, excl);
			incl = excl+input[i];
			excl = temp;
		}
		return Math.max(incl, excl);
	}

}
