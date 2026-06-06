import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int n = input.nextInt();
        for(int i = 0 ; i< n ; i++){
            for(int j =1 ; j<= n-i ; j++){
                System.out.print(" ");
            }
            for(char ch = 'A' ; ch< 'A' + i; ch++){
                System.out.print(ch);
            }
            for(char ch = (char)('A' + i - 2) ; ch>= 'A' ; ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
