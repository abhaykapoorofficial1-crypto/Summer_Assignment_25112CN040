import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.println("Enter rows");
     int rows = input.nextInt();
     System.out.println("Enter columns");
     int cols = input.nextInt();
     int [][] A = new int [rows][cols];
     int [][] B = new int [rows][cols];
     int [][] Subtract = new int [rows][cols];
     System.out.println("Enter A elements");
     for(int i = 0 ; i<rows ; i++){
        for(int j = 0 ; j<cols ; j++){
            A[i][j] = input.nextInt();
        }
     }
     System.out.println("Enter B elements");
     for(int i = 0 ; i<rows ; i++){
        for(int j = 0 ; j<cols ; j++){
            B[i][j] = input.nextInt();
        }
     }
     for(int i = 0 ; i<rows ; i++){
        for(int j = 0 ; j<cols ; j++){
            Subtract[i][j] = A[i][j] - B[i][j];
        }
     }
     System.out.println("Subtraction of two matrix is");
     for(int i = 0 ; i<rows ; i++){
        for(int j = 0 ; j<cols ; j++){
            System.out.print(Subtract[i][j] + " ");
        }
        System.out.println();
     }
    }
}
