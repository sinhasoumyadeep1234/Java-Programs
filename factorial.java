import java.util.*;
import java.lang.*;

class factorial
{	
	Scanner f;
	public static void main(String args[])
	{
	  Scanner f=new Scanner(System.in);
	  System.out.println("Enter the number to find its factorial:");
	  int number=f.nextInt();
	  int i=1,fact=1;
	  while(i<=number)
	  {
	       fact=fact*i;
		   i++;
	  }
	  System.out.println("Factorial of given number is:"+fact);
	}
}