import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}


