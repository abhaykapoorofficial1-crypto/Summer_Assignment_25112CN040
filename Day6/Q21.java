
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int n = input.nextInt();
        String Binary = "";
        if(n==0){
            Binary = "0";
        }
        else{
            while(n>0){
                Binary = ( n % 2) + Binary;
                n = n/ 2;
            }
        }
        System.out.println("Binary Number is "+ Binary); 
    } 
}
