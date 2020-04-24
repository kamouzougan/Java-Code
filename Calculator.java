import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner; 
public class Calculator { 
	public static void main (String []args ) { 
		double number1; 
		double number2;
		int choice ; 
		double total  ;
		
		while(true) {
		Scanner scan = new Scanner (System.in) ;
		
		System.out.println("1.addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division");
		System.out.println("Please make your selection");
		
		choice = scan.nextInt();
		if( choice == 1) {  
			System.out.println("Please you are about to perform an addition");
			System.out.println("Please enter number1");
			number1 = scan.nextInt();
			System.out.println("Please enter number 2");
			number2 = scan.nextInt();
			total = number1 + number2 ;
			System.out.println("The total of your addition is :" + total );
			System.out.println(" ");
		}
					
	    if( choice == 2) {  
			System.out.println("Please you are about to perform an addition");
			System.out.println("Please enter number1");
			number1 = scan.nextInt();
			System.out.println("Please enter number1");
			number2 = scan.nextDouble();
			total = number1 - number2 ;
			System.out.println("The total of your Subtraction  is :" + total );	
			System.out.println(" ");
		}
	    if( choice == 3) {  
			System.out.println("Please you are about to perform an Multiplication");
			System.out.println("Please enter number1");
			number1 = scan.nextDouble();
			System.out.println("Please enter number1");
			number2 = scan.nextDouble();
			total = number1 * number2 ;
			System.out.println("The total of your Subtraction  is :" + total );	
			System.out.println(" ");
		}
	    if( choice == 4) {  
			System.out.println("Please you are about to perform an addition");
			System.out.println("Please enter number1");
			number1 = scan.nextDouble();
			System.out.println("Please enter number1");
			number2 = scan.nextDouble();
			total = number1 / number2 ;
			System.out.println("The total of your Subtraction  is :" + total );	
			System.out.println(" ");
			
	    }
		
	}
}
}
