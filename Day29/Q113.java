import java.util.Scanner;

public class Q113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter Choice");
        int choice = input.nextInt();
        System.out.println("Enter first Number");
        int a = input.nextInt();
        System.out.println("Enter second Number");
        int b = input.nextInt();
        switch(choice){
            case 1 -> System.out.println("Result = "+(a+b));
            case 2 -> System.out.println("Result = "+(a-b));
            case 3 -> System.out.println("Result = "+(a*b));
            case 4 -> {
                if(b!=0){
                    System.out.println("Result = "+(a/b));
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
            }
            default -> System.out.println("Invalid choice");
        }
    }
}
