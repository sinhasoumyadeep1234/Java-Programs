import java.lang.*;
import java.util.*;

class BigData{
			
		public void  setval(int a,int b,double c,double d){
			
		}
		public void findmax(int a,int b,double c,double d){
			
			if(a>b){
				System.out.println("Maximum among  integers " +a+ " & " +b+ " is " +a);
			}
			if(b>a){
				System.out.println("Maximum among  integers " +a+ " & " +b+ " is " +b);
			}
			if(a==b){
				System.out.println("Both the integer numbers are equal!!");
				
			}
			if(c>d){
				System.out.println("Maximum among  doubles " +c+ " & " +d+ " is " +c);
			}
			if(d>c){
				System.out.println("Maximum among  doubles " +c+ " & " +d+ " is " +d);
			}
			else{
				System.out.println("Both the double numbers are equal !!");
				
			}
			
		}	
}
class MainBigData{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		BigData b1=new BigData();
		System.out.println("Enter two integer numbers to find which of them is maximum:");
		int p=sc.nextInt();
		int q=sc.nextInt();
                    System.out.println("Enter two double numbers to find which of them is maximum:");
		double r=sc.nextDouble();
		double s=sc.nextDouble();
		b1.setval(p,q,r,s);
		b1.findmax(p,q,r,s);

	}
}