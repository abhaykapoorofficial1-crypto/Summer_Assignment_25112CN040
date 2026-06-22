import java.util.Scanner;

public class Q103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 10000;
        int choice , amount;
        do { 
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch(choice){
                case 1 -> System.out.println("Balance "+ balance);
                case 2 -> {
                    System.out.println("Enter Amount To Deposit");
                    amount = input.nextInt();
                    balance+=amount;
                }
                case 3 -> {
                    System.out.println("Enter Withdraw Amount");
                    amount = input.nextInt();
                    if(amount<=balance){
                        balance-=amount;
                        System.out.println("Withdrawal Successful");
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }
                }
                    case 4 -> System.out.println("Thankyou For Using ATM");
                    default -> System.out.println("Invalid Choice");
            }
        } while (choice !=4);
    }
}
