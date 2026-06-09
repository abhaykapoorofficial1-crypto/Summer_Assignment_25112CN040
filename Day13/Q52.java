import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter array elements");
        for(int i = 0 ; i<n ; i++){
        arr[i] = input.nextInt();
        }
        int evencount = 0;
        int oddcount = 0;
        for(int i = 0 ; i<n ; i++){
            if(arr[i] % 2 == 0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even numbers count "+evencount);
        System.out.println("Odd numbers count "+oddcount);
    }
}
