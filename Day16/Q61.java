
import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            sum+=arr[i];
        }
        int expectedsum = n * (n+1)/2;
        int missingnumber = expectedsum - sum;
        System.out.println("Missing number is "+ missingnumber);
    } 
}
