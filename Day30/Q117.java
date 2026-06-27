import java.util.Scanner;

public class Q117 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] name = new String[5];
            int[] roll = new int[5];
            
            System.out.println("Enter details of 5 students:");
            
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter Roll No: ");
                roll[i] = sc.nextInt();
                sc.nextLine(); // clear buffer
                
                System.out.print("Enter Name: ");
                name[i] = sc.nextLine();
            }
            
            System.out.println("\nStudent Records:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Roll No: " + roll[i]);
                System.out.println("Name: " + name[i]);
                System.out.println();
            }
        }
    }
}
