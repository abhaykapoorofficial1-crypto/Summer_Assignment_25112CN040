
import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter String");
        String s = input.nextLine();
        String result = "";
        for(int i = 0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(result.indexOf(ch) == -1){
                result = result + ch;
            }
        }
        System.out.println("After removing duplicates " + result);
    }
}
