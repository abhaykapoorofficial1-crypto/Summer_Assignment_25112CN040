import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Item Name: ");
            String item = sc.nextLine();
            
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            
            double total = quantity * price;
            
            System.out.println("\n--- Inventory Details ---");
            System.out.println("Item Name : " + item);
            System.out.println("Quantity  : " + quantity);
            System.out.println("Price     : " + price);
            System.out.println("Total Cost: " + total);
        }
    }
}
