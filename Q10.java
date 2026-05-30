import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Start Number");
        int start = input.nextInt();
        System.out.println("Enter End Number");
        int end = input.nextInt();
        for(int n = start ; n<=end; n++){
            int count = 0;
            for(int i =1; i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Numbers are "+ n);
            }
        }
    }
    
}
