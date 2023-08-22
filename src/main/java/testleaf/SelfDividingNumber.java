package testleaf;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {

	public static void main(String[] args) {
		/*
		 * Question Description ******************** A self-dividing number is a number
		 * that is divisible by every digit it contains.
		 * 
		 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
		 * 0, and 128 % 8 == 0. A self-dividing number is not allowed to contain the
		 * digit zero.
		 * 
		 * Given two integers left and right, return a list of all the self-dividing
		 * numbers in the range [left, right].
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: left = 1, right = 22 Output: [1,2,3,4,5,6,7,8,9,11,12,15,22] Example
		 * 2:
		 * 
		 * Input: left = 47, right = 85 Output: [48,55,66,77]
		 * 
		 * Pseudocode
		 **********
		 *
		 * traverse through for loop, int i, from left (n) to right (m) integer if the
		 * number is m is <=19 then for loop and output = array.push(i) till the value
		 * of 'm' else travarse through and
		 */

		int n = 47;
		int m = 15;
		List<Integer> output = new ArrayList<Integer>();
		if (m <= 19) {
			for (int i = n; i <= m; i++) {
				while(m!=0) {
					
				}
				output.add(i);
			}
			System.out.println("output is " + output);
		} else {
						
		}
	}
}
