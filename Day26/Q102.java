import java.util.Scanner;

public class Q102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible for vote");
        }
    }
}
