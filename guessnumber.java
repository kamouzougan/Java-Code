import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
   // System.out.println("Hello world!");

    Random rand = new Random() ;
    int random_number = rand.nextInt(10);
    int tries = 0;
    Scanner  scan = new Scanner(System.in);
    int guess ;
    boolean win = false ;
    while (win == false){ 
      System.out.println("Please enter your number ");
      guess = scan.nextInt();
      tries++ ;
      if (guess == random_number ) { 
             win = true ;

      }
      else if (guess < random_number){
      System.out.println("Your number is too low ");
      }
      else if (guess > random_number){
      System.out.print("Your number is too high ");
      }
    }
    System.out.println("You win");
    System.out.println("The number was"+ random_number);
    
  }
}
