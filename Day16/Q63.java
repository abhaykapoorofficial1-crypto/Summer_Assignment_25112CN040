
import java.util.Scanner;

public class Q63 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the targeted eleemnt");
        int target = input.nextInt();
        System.out.println("Pairs with sum " + target + " are ");
        for(int i = 0 ; i< n ; i++){
            for(int j = i + 1 ; j<n ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i]+ " + " + arr[j]);
                }
            }
        }
    }
}
