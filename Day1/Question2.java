
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        for(int i=1;i<=10;i++){
            int result = n*i;
            System.out.println(n + "*" + i + "=" + result);
        }


        
    }
    
}
