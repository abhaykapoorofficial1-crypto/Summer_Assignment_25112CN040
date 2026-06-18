
import java.util.Scanner;

public class Q88 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        String result = str.replaceAll(" ","");
        System.out.println("String without spaces "+result);
    }
}
