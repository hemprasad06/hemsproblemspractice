package testleaf;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Aug23HW {
	
	/*
	 * Array Partition
	 * 
	 * Pseudo 	Code
	 * sort the input array
	 * Traverse through the input Array
	 * sum the array alternate element starting with index 0
	 * return the added integer
	 */
	
	@Test
	public void test1() {
		int actual = array_Partition(new int[] {1,2,3,4,5});
		Assert.assertEquals(9, actual);
	}

	@Test
	public void test2() {
		int actual = array_Partition(new int[] {1,4,3,2});
		Assert.assertEquals(4, actual);
	}

	
	public int array_Partition(int[] input) {
		int arrayLength = input.length;
		Arrays.sort(input);
		int result = 0;
		for(int i=0;i<=arrayLength-1;i=i+2) {
			 result = result+input[i];
		}
		return result;
		
	}
}
