import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            
            System.out.println("Menu");
            System.out.println("1. Convert to Uppercase");
            System.out.println("2. Convert to Lowercase");
            System.out.println("3. Find Length");
            System.out.println("4. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1 -> System.out.println("Uppercase: " + str.toUpperCase());
                
                case 2 -> System.out.println("Lowercase: " + str.toLowerCase());
                
                case 3 -> System.out.println("Length: " + str.length());
                
                case 4 -> System.out.println("Program End");
                
                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
