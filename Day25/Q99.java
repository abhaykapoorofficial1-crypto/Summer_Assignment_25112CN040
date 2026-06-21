
import java.util.Arrays;

public class Q99 {
    public static void main(String[] args) {
        String[] names = { "Rahul","Amit"};
        Arrays.sort(names);
        System.out.println("Sorted Names");
        for(String name : names){
            System.out.println(name);
        }
    }
}
