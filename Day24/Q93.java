import java.util.Scanner;

public class Q93 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter String 1");
        String s1 = input.nextLine();
        System.out.println("Enter String 2");
        String s2 = input.nextLine();
        if(s1.length()==s2.length() && (s1 + s1).contains(s2)){
            System.out.println("Strings are rotation of each other");
        }
        else{
            System.out.println("Strings are not rotation of each other");
        }
    }
}
