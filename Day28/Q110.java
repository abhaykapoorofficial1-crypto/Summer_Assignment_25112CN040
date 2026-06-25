import java.util.Scanner;

public class Q110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000;
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("Enter choice");
        int choice = input.nextInt();
        switch (choice) {
            case 1 ->                 {
                    System.out.println("Enter amount ");
                    int amount = input.nextInt();
                    balance = balance + amount;
                    System.out.println("New Balance = "+balance);
                }
            case 2 ->                 {
                    System.out.println("Enter amount ");
                    int amount = input.nextInt();
                    balance = balance - amount;
                    System.out.println("New Balance "+balance);
                }
            default -> System.out.println("Inavlid Choice");
        }
    } 
}
