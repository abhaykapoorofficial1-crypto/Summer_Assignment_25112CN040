import java.util.Scanner;

public class Q119 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] name = new String[3];
            int[] id = new int[3];
            
            // Input employee details
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter Employee ID: ");
                id[i] = sc.nextInt();
                sc.nextLine();
                
                System.out.print("Enter Employee Name: ");
                name[i] = sc.nextLine();
            }
            
            // Display employee details
            System.out.println("\nEmployee Records");
            for (int i = 0; i < 3; i++) {
                System.out.println("Employee ID: " + id[i]);
                System.out.println("Employee Name: " + name[i]);
                System.out.println();
            }
        }
    }
}
