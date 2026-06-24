import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] name = new String[5];
        int [] rollno = new int[5];
        System.out.println("Enter details of 5 student");
        for(int i = 0 ; i<5 ; i++){
            System.out.println("Enter roll no");
            rollno[i] = input.nextInt();
            input.nextLine();
            System.out.println("Enter names");
            name[i] = input.nextLine();
        }
        System.out.println("\nStudent Records");
        for(int i = 0 ; i<5 ; i++){
            System.out.println("Roll No: "+rollno[i]);
            System.out.println("Name: "+name[i]);
        }
    }
}
