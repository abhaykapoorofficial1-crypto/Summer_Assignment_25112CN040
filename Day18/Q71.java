
import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter array elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to search");
        int key = input.nextInt();
        int low = 0 ; int high = n - 1;
        int found = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                found =mid ;
                break;
            }
            else if (arr[mid]<key){
                low = mid + 1 ;
            }
            else{
                high = mid - 1 ;
            }
        }
        if(found !=1){
            System.out.println("Element found at index " + found);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
