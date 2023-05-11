import java.util.Scanner;
public class GradeCalculating {
    public static void main(String[] args) {
        //Describe variables
        int math,physics,chemistry,turkish,music,history;

        //Describe Scanner class
        Scanner input = new Scanner(System.in);

        //Take int value from user
        System.out.print("Enter math grade:");
        math = input.nextInt();

        System.out.print("Enter physics grade:");
        physics = input.nextInt();

        System.out.print("Enter chemistry grade:");
        chemistry = input.nextInt();

        System.out.print("Enter turkish grade:");
        turkish = input.nextInt();

        System.out.print("Enter music grade:");
        music = input.nextInt();

        System.out.print("Enter history grade:");
        history = input.nextInt();

        //Calculate average
        int total = (math + physics + chemistry + turkish + music + history);
        int result = (total / 6);
        System.out.println("Your average is " +result);

        //Passed or Failed
        String str = (result > 60) ? "Passed" : "Failed";
        System.out.print(str);
    }
}
