
import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        int [] freq = new int [256];
        for(int i = 0 ; i<str.length() ; i++){
            freq[str.charAt(i)]++;
        }
        char maxchar = str.charAt(0);
        int max = 0;
        for(int i = 0 ; i<str.length() ; i++){
            if(freq[str.charAt(i)]>max){
                max = freq[str.charAt(i)];
                maxchar = str.charAt(i);
            }
        }
        System.out.println("Maximum Occurring character: "+maxchar);
    }
}
