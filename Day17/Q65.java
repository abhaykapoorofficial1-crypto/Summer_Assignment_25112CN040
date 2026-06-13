
import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first array size");
        int n1 = input.nextInt();
        int [] arr1 = new int[n1];
        System.out.println("Enter first array elements");
        for(int i = 0 ; i<n1 ; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter second array size");
        int n2 = input.nextInt();
        int [] arr2 = new int[n2];
        System.out.println("Enter second array elements");
        for(int i = 0 ; i<n2 ; i++){
            arr2[i] = input.nextInt();
        }
        int [] merged = new int [n1+n2];
        for(int i = 0 ; i<n1 ;i++ ){
            merged[i] = arr1[i];
        }
        for(int i = 0 ; i<n2 ; i++){
            merged[n1+i] = arr2[i];
        }
        System.out.println("Merged Array is ");
        for(int i = 0 ; i<merged.length ; i++){
            System.out.println(merged[i]+" ");
        }
    }
}
