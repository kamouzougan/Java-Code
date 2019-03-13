//This code will tell you how old you will be in 100 years from now 

import java.util.Scanner;
public class Years {
	
	
	public static void main(String[]args) 
	{   
		
		int total ;
		Scanner scan = new Scanner(System.in) ;
		 String name ;
		System.out.print("Please enter your name"); 
		 name = scan.nextLine() ;
		 
		 int age ;
		 System.out.print("Please enter your age");
		 age = scan.nextInt();
		 
		 total = ((2019 - age)+ 100) ;
		 System.out.println(total);
		 
		 System.out.println(name + "You will be 100 years old in : " +  total);
		
		 
	}
	

}
