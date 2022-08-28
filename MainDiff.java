/*Program for method overloading*/

import java.lang.*;
import java.util.*;

class CalDiff{
		public void caldiff(int a,int b){
			System.out.println("The difference of  "+a+" & "+b+" is "+(a-b));
		}
		public void caldiff(double x,double y){
			System.out.println("The difference of  "+x+" & "+y+" is "+(x-y));
		}
}
class MainDiff{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two integers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Enter two doubles:");
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			CalDiff  b1=new CalDiff();
			b1.caldiff(a,b);
			b1.caldiff(x,y);
		}
}
		
	