import java.util.Scanner; 

public class vowelscount {
	public static void main(String[]args) { 
	    
		int vowelscount = 0 ;
		int con_Count = 0 ; 
		String empty = " ";
		String con_empty =" "  ;
		String str ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your a sentence or your name");
		str = scan.nextLine() ;
		//str = str.toLowerCase();
		//String str ="Midtown international School";
		for (int i = 0 ; i < str.length() ; i ++ ) { 
			//System.out.println(str.charAt(i));
			char ch = str.charAt(i);
			if (ch == 'a'|| ch == 'A'||  ch =='i'|| ch == 'I' || ch =='o'|| ch == 'O'|| ch == 'U'|| ch == 'u' || ch == 'e'|| ch == 'E' || ch == 'y'|| ch == 'Y') {
				empty += ch ;
				vowelscount ++ ;
			}
		}
		/*
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
				
				
				con_Count ++ ;
			
			
			}*/
			
		for (int j = 0 ; j < str.length(); j++) { 
			char con = str.charAt(j); 
			if (con == 'B' || con == 'b'||con == 'c'||con=='C' || con =='D'|| con=='d'||con=='F'||con=='f'||con=='G'||con=='g'||con=='H'||con=='h'||con=='J'||con=='j'||
					con=='K'||con=='k'||con=='L'||con=='l'||con=='M'||con=='m'||con=='N'||con=='n'||con=='p'||con=='p'||con=='Q'||con=='q'||con=='R'||con=='S'||con=='r'||
					con=='s'||con=='T'||con=='t'||con=='v'||con=='V'||con=='X'||con=='x'||con=='Z'||con=='z') {
				
				con_Count ++ ;
				con_empty +=con ;
			}
			
		}
		
		System.out.println(" Your vowel count is :  " + vowelscount);
		System.out.println(" Your vowels are :  " + empty);
		System.out.println("Your consonantes count is : " + con_Count);
		System.out.println("Your consonantes are : " + con_empty );
			
	}
}
