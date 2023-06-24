import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        int num1 = 0, num2 = 1, sum = 0;
        for (int i = 0; i < num; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(sum);
        }

    }
}
