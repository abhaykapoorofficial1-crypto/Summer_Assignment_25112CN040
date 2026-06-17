import java.util.Scanner;

public class Q81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String str = input.nextLine();
        int count = 0 ; 
        for(char ch: str.toCharArray()){
            count++;
        }
        System.out.println("Length of the string "+count);
    }
}
