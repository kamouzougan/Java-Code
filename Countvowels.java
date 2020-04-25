import java.util.Scanner; 

public class Persontest {
	public static void main(String[]args) { 
	
		int count = 0 ;
		String empty = " ";
		String str ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your a sentence or your name");
		str = scan.nextLine() ;
		
		//String str ="Midtown international School";
		for (int i = 0 ; i < str.length() ; i ++ ) { 
			//System.out.println(str.charAt(i));
			char ch = str.charAt(i);
			if (ch == 'a'|| ch == 'A'||  ch =='i'|| ch == 'I' || ch =='o'|| ch == 'O'|| ch == 'U'|| ch == 'u' || ch == 'e'|| ch == 'E' || ch == 'y'|| ch == 'Y') {
				empty += ch ;
				count ++ ;
			}
			
		}
		
		System.out.println(" Your vowel count is :  " + count);
		System.out.println(" Your vowels are :  " + empty);
			
	}
}

