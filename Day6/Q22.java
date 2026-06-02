
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        int binary = input.nextInt();
        int decimal = 0;
        int power = 0;
        while(binary>0){
            int digit = binary % 10;
            decimal += digit * Math.pow(2,power);
            power ++;
            binary/= 10;
        }
        System.out.println("Decimal Number is "+ decimal);
    }
}
