import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of array");
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
            sum+=i;
        }
        double average = (double) sum / n;
        System.out.println("Sum of all elements is "+ sum);
        System.out.println("Average of all elements is "+ average);
    }
}
