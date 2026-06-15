import java.util.Scanner;

public class Q75 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter rows");
        int rows = input.nextInt();
        System.out.println("Enter columns");
        int cols = input.nextInt();
        int[][] matrix = new int [rows] [cols];
        System.out.println("Enter matrix elements");
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Transpose of matrix is ");
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
