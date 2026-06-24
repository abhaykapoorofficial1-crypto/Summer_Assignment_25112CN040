import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] name = new String[3];
        int [] id = new int[3];
        System.out.println("Enter details of empolyees");
        for(int i = 0 ; i<3 ; i++){
            System.out.println("Enter Id ");
            id [i] = input.nextInt();
            input.nextLine();
            System.out.println("Enter name");
            name [i] = input.nextLine();
        }
        for(int i = 0 ; i<3 ; i++){
            System.out.println("ID: "+id[i]);
            System.out.println("Name: "+name[i]);
        }
    }
}
