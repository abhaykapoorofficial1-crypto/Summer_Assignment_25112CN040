import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        System.out.println("What is 2+2");
        int answer = input.nextInt();
        if(answer==4){
            System.out.println("Correct !!");
            score++;
        }
        else{
            System.out.println("Not Correct");
        }
        System.out.println("Your Score "+score);
    }
}
