import java.util.*;
import java.lang.*;

class pattern_50
{	
	Scanner r;
	public static void main(String args[])
	{
	  Scanner r=new Scanner(System.in);
	  System.out.println("Enter the number of rows:");
	  int number=r.nextInt();
	  int i,j;
	  for(i=0;i<number;i++)
	  {
		for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
	  System.out.println("");
	  }
	  
	}
}