
import java.util.Scanner;

public class Q66 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of first array");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array");
        for(int i = 0 ; i<n1 ; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the size of second array");
        int n2 = input.nextInt();
        int [] arr2 = new int[n2];
        System.out.println("Enter the elements of second array");
        for(int i = 0 ; i<n2 ; i++){
            arr2[i] = input.nextInt();
        }
        int [] temp = new int[n1+n2];
        int k = 0;
        for(int i = 0 ; i<n1 ; i++){
            temp[k++] = arr1[i];
        }
        for(int i = 0 ; i<n2 ; i++){
            boolean found = false ;
            for(int j = 0 ; j<k ; j++){
                if(temp[j] == arr2[i]){
                    found = true ; 
                    break;
                }
            }
            if(!found){
                temp[k++] = arr2[i];
            }
        }
        System.out.println("Union of arrays is ");
            for(int i = 0 ; i<k ; i++){
                System.out.println(temp[i]+" ");
            }
        }
}
