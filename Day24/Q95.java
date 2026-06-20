
import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = input.nextLine();
        String [] words = s.split(" ");
        String longest = words[0];
        for(int i = 1 ; i<words.length ; i++){
            if(words[i].length()>longest.length()){
             longest = words[i];
            }
        }
        System.out.println("Longest Words " + longest);
    }
}
