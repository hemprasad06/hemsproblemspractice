package testleaf;

public class Naman26AugCWEX02 {
	
	/*
	 * Traverse throught the input string using for loop
	 * if the char contains aeiou then delete char
	 */
	
	public static void main(String[] args) {
		

		// TODO Auto-generated method stub
		
		StringBuilder input = new StringBuilder("Hi testleaf students");
		for(int i=0;i<=input.length()-1;i++) {
			char value = input.charAt(i);
			if(value=='a' || value == 'e' || value == 'i'|| value == 'o'|| value == 'u') {
				input.append(value);
			//while (value=='a' || value == 'e' || value == 'i'|| value == 'o'|| value == 'u') {
			//input.deleteCharAt(i);
						
			}
		
		}
		System.out.println(input);
	}

}
