package testleaf;

public class Naman26AugEX1 {
	
	/*
	 * Traverse the input to the for loop
	 * check if the input(i) is less than or equal to asci of numbers, if yes append the i to output
	 * else if the input(i) is equal to "."then append "[.]" 
	 * else print "Enter valid input"
	 * 	 */
	
public static void main(String[] args) {
	String input = new String("1.3.1.1");
	String output = new String();
	for(int i=0;i<=input.length()-1;i++) {
		char value = input.charAt(i);
		if(value=='.') 
		{
			output = output+"[.]";
		}
		else {
			output = output+value;
		}

	}
	System.out.println(output);
}


}
