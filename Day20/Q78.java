
import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); 
        System.out.println("Enter the order of matrix");
        int n = input.nextInt();
        int [][] matrix = new int [n][n];
        System.out.println("Enter matrix elements");
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                matrix[i][j] = input.nextInt();
        }
    }
    boolean symmetric = true;
    for(int i = 0 ; i<n ; i++){
        for(int j = 0 ; j<n ; j++){
            if(matrix [i][j] != matrix[j][i]){
               symmetric = false;
               break;
            }
        }
    }
    if(symmetric){
        System.out.println("Matrix is Symmetric");
    }
    else{
        System.out.println("Matrix is not Symmetric");
    }
}
}
