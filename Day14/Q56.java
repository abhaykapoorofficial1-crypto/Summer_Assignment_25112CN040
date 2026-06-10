
import java.util.Scanner;

public class Q56 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter elements of array");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Duplicate elements are ");
        for(int i = 0 ; i<n ; i++){
            for( int j = i + 1 ; j<n ; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
