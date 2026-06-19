
import java.util.Scanner;

public class Q89 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.println("First Non Repeating Character "+ch);
                break;
            }
        }
    }
}
