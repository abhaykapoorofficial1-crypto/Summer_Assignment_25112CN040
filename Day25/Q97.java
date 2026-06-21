import java.util.Arrays;
import java.util.Scanner;

public class Q97 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array 1");
        int n1 = input.nextInt();
        System.out.println("Enter size of array 2");
        int n2 = input.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Enter array 1 elements ");
        for(int i = 0 ; i<n1 ; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter array 2 elements ");
        for(int i = 0 ; i<n2 ; i++){
            arr2[i] = input.nextInt();
        }
        int[] merged = new int [arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        Arrays.sort(merged);
        System.out.println("Merged Array: "+Arrays.toString(merged));
    }
}
