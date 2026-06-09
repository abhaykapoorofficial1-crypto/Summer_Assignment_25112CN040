import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int  [] arr = new int[n];
        System.out.println("Enter the elements ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Elements are ");
        for(int i = 0 ; i<n ; i++){
            System.out.println(arr[i]+" ");
        }
    } 
}

