import java.lang.*;
import java.util.*;

class Calc_vowel
{
	Scanner sc;
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your string to count vowels:");
	  String s1 = sc.nextLine();
	  Vowels_count calc = new Vowels_count();
	  calc.count_vowels(s1);
	 } 
}
class Vowels_count
{
	
	public void count_vowels(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length();i++)
     	{
	      	char ch=s1.charAt(i);
		 	if(ch=='a' ||ch=='e' ||ch='i' ||ch='o' ||ch='u' ||ch='A' ||ch='E' ||ch='I' ||ch='O' ||ch='U')
		 	{
			 	count++;
		 	}
		}
		System.out.println("Number of vowels found is" +count);
     }
}