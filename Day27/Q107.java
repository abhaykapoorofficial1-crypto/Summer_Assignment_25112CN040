import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Empolyee Name ");
        String name = input.nextLine();
        System.out.println("Enter Salary ");
        double salary = input.nextInt();
        System.out.println("Empolyee Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
