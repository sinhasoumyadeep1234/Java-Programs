import java.lang.*;
import java.util.*;

class ChangeCase {
    Scanner sc;    
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
	   System.out.println("Enter your string:");
	   String str1=sc.nextLine();    
        StringBuffer newStr=new StringBuffer(str1);    
            
        for(int i = 0; i < str1.length(); i++) {
		      
            char ch=str1.charAt(i);
		  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')	
		  {
                
           	 if(Character.isLowerCase(str1.charAt(i))) 
			 {    
                    
                	newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
            	 }    
                
            	 else if(Character.isUpperCase(str1.charAt(i))) 
			 {    
                    
                	newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
                }
		  }    
        }    
        System.out.println("String after case conversion : " + newStr);    
    }    
}