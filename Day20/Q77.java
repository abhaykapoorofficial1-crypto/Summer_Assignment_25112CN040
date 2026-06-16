
import java.util.Scanner;

public class Q77 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter rows and columns of first matrix");
        int r1 = input.nextInt();
        int c1 = input.nextInt();
        System.out.println("Enter rows and columns of second matrix");
        int r2 = input.nextInt();
        int c2 = input.nextInt();
        if(r1!=c2){
            System.out.println("Matrix multiplication not possible ");
            return;
        }
        int [][] A = new int [r1][c1];
        int [][] B = new int [r2][c2];
        int [][] C = new int [r1][c2];

        System.out.println("Enter elements of first matrix");
        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0 ; j<c1 ; j++){
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix");
        for(int i = 0 ; i<r2 ; i++){
            for(int j = 0 ; j<c2 ; j++){
                B[i][j]  = input.nextInt();
            }
        }
        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0 ; j<c2 ; j++){
                for(int k = 0 ; k<c1 ; k++){
                    C[i][j] += A[i][j] * B[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix ");
        for(int i = 0 ; i<r1 ; i++){
            for(int j = 0 ; j<c2 ; j++){
                System.out.print(C[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
