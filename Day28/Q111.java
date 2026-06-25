import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tickets = 100;
        System.out.println("Enter number of tickets to book ");
        int book = input.nextInt();
        if(book<=tickets){
            tickets = tickets - book;
            System.out.println("Tickets Book Successfully");
            System.out.println("Remaining Tickets "+tickets);
        }
        else{
            System.out.println("Tickets Not Available");
        }
    }
}
