
import java.util.Scanner;

public class Q94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = input.nextLine();
        int count = 1;
        for(int i = 0 ; i<s.length();i++){
            if(i+1 <s.length() && s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            System.out.println(s.charAt(i));
            System.out.print(count);
            count = 1;
        }   
    }
}
