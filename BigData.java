import java.lang.*;
import java.util.*;

class BigData{
			int a;
			int b;
		public void  setval(int x,int y){
			a=x;
			b=y;
		}
		public void findmax(int a,int b){
			int max=0;
			if(a>b){
				max=a;
			}
			else if(b>a){
				max=b;
			}
			else{
				System.out.println("Both the numbers are equal");

			}
			System.out.println("Maximum among  " +a+ " & " +b+ " is " +max);
		}	
}
class MainBigData{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		BigData b1=new BigData();
		System.out.println("Enter two numbers to find which of them is maximum:");
		int p=sc.nextInt();
		int q=sc.nextInt();
		b1.setval(p,q);
		b1.findmax(p,q);
	}
}