import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i = 1 ; i<n ; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
            if(arr[i]< smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest number is " + largest);
        System.out.println("Smallest Number is "+smallest);
    }
}
