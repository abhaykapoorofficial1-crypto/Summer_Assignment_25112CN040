import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] books = {"Java", "Python", "C++", "DSA", "HTML"};
            int choice;
            
            System.out.println("Mini Library System");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1 -> {
                    System.out.println("Available Books:");
                    for (int i = 0; i < books.length; i++) {
                        System.out.println((i + 1) + ". " + books[i]);
                    }
                }
                case 2 -> {
                    System.out.print("Enter book number to issue (1-5): ");
                    int n = sc.nextInt();
                    if (n >= 1 && n <= 5) {
                        System.out.println("Book Issued: " + books[n - 1]);
                    } else {
                        System.out.println("Invalid Book Number");
                    }
                }
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
