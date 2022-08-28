/* Program to implement the concept of command line arguments*/

class Comtest{
	public static void main(String args[])
	{
		int count,i=0;
    		String s1;
    		count=args.length;
		System.out.println("Number of arguments are=" +count);
		while(i<count)
		{
			s1=args[i];
			i=i+1;
			System.out.println("java is " +s1+" ! ");
		}
	}
}



