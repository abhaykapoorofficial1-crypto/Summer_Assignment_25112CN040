
import java.util.Scanner;

public class Q87 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the string ");
        String str = input.nextLine();
        System.out.println("Enter the character");
        char ch = input.next().charAt(0);
        int count = 0 ; 
        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("Frequency of " + ch + " = " +count);
    }
}
