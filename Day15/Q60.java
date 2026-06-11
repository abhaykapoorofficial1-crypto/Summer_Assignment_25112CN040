import java.util.Scanner;
public class Q60 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n = input.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter array elements");
        for(int i = 0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
        int index = 0;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }
        while(index <n){
            arr[index++] = 0 ;
        }
        for(int i = 0 ; i< n ; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
