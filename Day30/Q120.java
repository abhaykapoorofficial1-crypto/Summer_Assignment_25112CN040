import java.util.Scanner;

public class Q120 {
    static String[] name = new String[5];
    static int[] roll = new int[5];
    static int count = 0;

    static void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        count++;
        System.out.println("Student Added Successfully!");
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Records Found!");
            return;
        }

        System.out.println("\nStudent Records:");
        for (int i = 0; i < count; i++) {
            System.out.println("Roll No: " + roll[i]);
            System.out.println("Name: " + name[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. Display Students");
                System.out.println("3. Exit");
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        if (count < 5)
                            addStudent();
                        else
                            System.out.println("Record Full!");
                    }
                    
                    case 2 -> displayStudents();
                    
                    case 3 -> System.out.println("Thank You!");
                    
                    default -> System.out.println("Invalid Choice!");
                }
                
            } while (choice != 3);
        }
    }
}
