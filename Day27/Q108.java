import java.util.Scanner;

public class Q108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Name ");
        String name = input.nextLine();
        System.out.println("Enter marks in Maths");
        int m1 = input.nextInt();
        System.out.println("Enter marks in Science");
        int m2 = input.nextInt();
        System.out.println("Enter marks in Social Science");
        int m3 = input.nextInt();
        int total = m1+m2+m3;
        double percentage = total/3;
        System.out.println("Name of Student: "+ name);
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+percentage);
    }
}
