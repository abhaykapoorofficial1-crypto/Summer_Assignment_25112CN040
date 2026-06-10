
import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter array elements");
        for(int i = 0 ; i< n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Target Element");
        int target = input.nextInt();
        int count = 0;
        for(int i = 0 ; i<n ; i++){
            if( arr[i] == target){
                count++;
            }
        } 
        System.out.println("Frequency of the targeted element is "+ count);
    }
}
