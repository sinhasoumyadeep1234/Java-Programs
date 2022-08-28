import java.util.*;
import java.lang.*;

class Prime_50
{	
	Scanner p;
	public static void main(String args[])
	{
	  int temp=0;
	  Scanner p=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  int number=p.nextInt();
	  int i;
	  for(i=2;i<=number-1;i++)
	  {
		if(number%i==0)
			{
				temp=temp+1;
			}
	 
	  }
	  if(temp==0)
	  {
            System.out.println(number+"is a prime number");
	  
	  }
        else
        {
		System.out.println(number+"is not a prime number");
	  }
       }
}