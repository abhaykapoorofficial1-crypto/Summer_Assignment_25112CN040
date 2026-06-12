
import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter elements of array");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        int maxcount = 0;
        int maxelement = arr[0];
        for(int i = 0 ; i<n ; i++){
            int count = 0;
            for(int j = 0 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>maxcount){
                maxcount = count;
                maxelement = arr[i];
            }
        }
        System.out.println("Max frequency element "+ maxelement);
        System.out.println("Frequency "+maxcount);
    }
}
