
import java.util.Scanner;

public class Q67 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of first array");
        int n1 = input.nextInt();
        int [] arr1 = new int[n1];
        System.out.println("Enter elements of first array");
        for(int i = 0 ; i<n1 ; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the size of second array");
        int n2 = input.nextInt();
        int [] arr2 = new int [n2];
        System.out.println("Enter elements of second array");
        for(int i = 0 ; i<n2 ; i++){
            arr2[i] = input.nextInt();
        }
        System.out.println("Intersection of arrays are");
        for(int i = 0 ; i<arr1.length ; i++){
            for(int j = 0 ; j<arr2.length ; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+" ");
                    break;
                }
            }
        }
    }
}
