package testleaf;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Aug18Exercise

{
		WebElement e = new WebElement();
	Select test = new Select(e);
	
		/*
		 * check if the input is 0, return 0
		 * else if input is 1, return 1;
		 * else if, traverse through a for loop increment till 'n'
		 * declare int output = 0
		 * if (n%3==0), output = output + n
		 * else if (n%5==0), output = output + n
		 * else if (n%7==0), output = output+n
		 * return output
		 */

	public static void main(String[] args) {
		int n=9;
		   int output;
	    if (n==0)
	    {
	    	output = 0;
	    }
	    else if (n==1)
	    {
	    	output = 0;
	    }
	    else
	    {
	    	output = 0;
	    for(int i=2;i<=n;i++)
	    {
	        if(i%3==0)
	        {
	        output = output+i;
	        }
	        else  if(i%5==0)
	        {
	        output = output+i;
	        }
	         if(i%7==0)
	        {
	        output = output+i;
	        }
	    }

	}
	    System.out.println("Out put is " + output );
	}
	}

}
