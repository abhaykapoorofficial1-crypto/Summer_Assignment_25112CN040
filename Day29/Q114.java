import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[5];
            int choice, i, key;
            do {
                System.out.println("\nMenu");
                System.out.println("1. Insert");
                System.out.println("2. Display");
                System.out.println("3. Search");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter 5 elements:");
                        for (i = 0; i < 5; i++) {
                            arr[i] = sc.nextInt();
                        }
                    }
                        
                    case 2 -> {
                        System.out.println("Array Elements:");
                        for (i = 0; i < 5; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                        
                    case 3 -> {
                        System.out.print("Enter element to search: ");
                        key = sc.nextInt();
                        boolean found = false;
                        
                        for (i = 0; i < 5; i++) {
                            if (arr[i] == key) {
                                System.out.println("Element Found");
                                found = true;
                                break;
                            }
                        }
                        
                        if (!found)
                            System.out.println("Element Not Found");
                    }
                        
                    case 4 -> System.out.println("Program End");
                        
                    default -> System.out.println("Invalid Choice");
                }
                
            } while (choice != 4);
        }
    }
}
