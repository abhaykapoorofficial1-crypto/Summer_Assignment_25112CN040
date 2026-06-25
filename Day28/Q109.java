import java.util.Scanner;

public class Q109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Issued Book ");
        System.out.println("2. Returned Book ");
        System.out.println("Enter Choice ");
        int choice = input.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Book Issued Successfully ");
            case 2 -> System.out.println("Book Returned Successfully");
            default -> System.out.println("Invalid Choice");
        }
    }
}
