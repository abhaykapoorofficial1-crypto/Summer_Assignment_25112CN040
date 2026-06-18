
import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the sentence");
        String str = input.nextLine();
        String [] words = str.split(" ");
        System.out.println("Number of words "+ words.length);
    }
}
