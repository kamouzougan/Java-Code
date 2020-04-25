import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int amount;
    int choice ;
    int deposit ;
    int balance = 0 ;
    boolean trans = true ;
    while (trans){
    Scanner scan = new Scanner(System.in);
    System.out.println("Please make a selection");
    System.out.println("1-deposit");
    System.out.println("2-withdraw");
    System.out.println("3-checkbalance");

    System.out.println("");
  
  choice = scan.nextInt();
  if (choice == 1) { 
    System.out.println("Please enter your deposit");
    deposit = scan.nextInt();
    balance = balance + deposit ;
    System.out.println("Your total balance is "+balance);
    System.out.println("");
  }
  else if (choice == 2 ){
  System.out.println("Please enter your amount you want to withdraw");
    amount  = scan.nextInt();
    balance = balance - amount ;
    System.out.println("Your total balance is "+balance);
  }
  else if (choice == 3){

    System.out.println("Your total balance is "+balance);

  }
    }  
                       
  }
}
