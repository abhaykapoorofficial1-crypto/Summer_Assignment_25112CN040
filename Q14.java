
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        if(n==0){
            System.out.println("Nth fibonacci term is 0");
        }
        else if(n==1){
            System.out.println("Nth fibonacci term is 1");
        }
        else{
            for(int i =2;i<=n;i++){
               int c = a + b;
               a=b;
               b=c;
            }
            System.out.println("Nth Fibonacci Term is " + b);
        }
    } 
}
