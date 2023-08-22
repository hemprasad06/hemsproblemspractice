package testleaf;

import org.junit.Test;
import org.testng.Assert;

public class Aug22HW {
	/*
	 * Q645 Traverse through the length in a for loop, i=1, i<= lenght of the array
	 * compare the value of i with i-1, is greater || is != ; if true, continue, if
	 * false then that digit is the duplicate number, push the i to the result array
	 * and also push i+1 to the array; return the array
	 */

	
	@Test
	public void test1() {
		int[] actualResult = setMismatch(new int[] {1,2,3,3,5,6});
		int[] expected = {3,4};
		Assert.assertEquals(actualResult, expected);
			}
	
	@Test
	public void test2() {
		int[] actualResult = setMismatch(new int[] {1,2,3,4,5,6,6,8});
		int[] expected = {6,7};
		Assert.assertEquals(actualResult, expected);
			}	
	@Test
	public void test3() {
		int[] actualResult = setMismatch(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,13,15});
		int[] expected = {13,14};
		Assert.assertEquals(actualResult, expected);
			}

	public int[] setMismatch(int[] input) {
		int lengthone = input.length;
		int[] result= new int[2];
		for(int i = 1; i<=lengthone-1; i++) {
			if(input[i]==input[i-1]) {
			result[0]=i;
			result[1]=i+1;	
			}
			
		}
		return result;
		}

	}
		
		//int result[]= {};
