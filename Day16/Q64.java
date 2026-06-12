
import java.util.Scanner;

public class Q64 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter array elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Array after removing duplicates");
        for(int i = 0 ; i<n ; i++){
            boolean duplicate = false;
            for(int j = 0 ; j< i ; j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
