import java.util.Scanner;

public class Q72 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0 ; i<n-1 ; i++){
            int minindex = i;
            for(int j = i+1 ; j<n ; j++){
                if(arr[j] < arr[minindex]){
                    minindex = j ;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        System.out.println("Decending Array");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    } 
}
