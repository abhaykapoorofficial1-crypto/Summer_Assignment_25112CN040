
import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target  element");
        int target = input.nextInt();
        for(int i = 0 ; i<n ; i++){
            if(target == arr[i]){
                System.out.println("Found");
                return ;
            }
        }
        System.out.println("Not Found");
    } 
}
