
import java.util.Arrays;

public class Q91 {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        char [] a = str1.toCharArray();
        char [] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a,b)){
            System.out.println("Analgam");
        }
        else{
            System.out.println("Not Analgam");
        }
    }
}
