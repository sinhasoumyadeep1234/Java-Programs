/*Program to update existing values using constructor concept*/

import java.lang.*;
import java.util.*;

class  Box{
		int l;
		int w;
		int h;
		Box(int a,int b,int c){
		l=a;
		w=b;
		h=c;
		}
		public void setval(int l,int w,int h){
		this.l=l;
		this.w=w;
		this.h=h;
		}
		public void getval(){
			System.out.println("The value of l = "+l+ "w= "+w+ "h= "+h);
		}
}
class Mainbox2{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Box b1=new Box(1,2,3);
		Box b2=new Box(4,5,6);
		System.out.println("The value of l,b,h given by 1st const are");
		b1.getval();
		System.out.println("The value of l,b,h given by 2nd const are");
		b2.getval();
		System.out.println("Enter the new values of l,b,h");
		int l1=sc.nextInt();
		int w1=sc.nextInt();
		int h1=sc.nextInt();
		b1.setval(l1,w1,h1);
		b1.getval();
		System.out.println("Enter the new values 2 of l,b,h");
		int l2=sc.nextInt();
		int w2=sc.nextInt();
		int h2=sc.nextInt();
		b2.setval(l2,w2,h2);
		b2.getval();
		}
}