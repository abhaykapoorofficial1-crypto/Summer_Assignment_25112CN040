import java.util.Scanner;
public class Q43 {
    public static boolean Primecheck(int n){
        if(n<=0)
            return false;
        
        for(int i = 2 ; i<= n/2 ; i++){
            if(n%2==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        if(Primecheck(n)){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }
}
