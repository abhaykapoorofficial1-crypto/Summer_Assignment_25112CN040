
import java.util.Scanner;

public class Q58 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter array size ");
        int n = input.nextInt();
        int[] arr = new int [n];
        System.out.println("Enter array elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        int temp = arr[0];
        for ( int i = 0 ; i<n-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        for( int i = 0 ; i<n ; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
