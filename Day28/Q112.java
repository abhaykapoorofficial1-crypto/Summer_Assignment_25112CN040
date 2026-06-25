import java.util.Scanner;

public class Q112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Contact Name ");
        String name = input.nextLine();
        System.out.println("Enter Contact Number ");
        long number = input.nextLong();
        System.out.println("\nContact Saved Successfully");
        System.out.println("Name - "+name);
        System.out.println("Number- "+number);
    }
}
