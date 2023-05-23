import java.util.Scanner;

public class UceDordeTambolunme {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        k = input.nextInt();

        int sum = 0, count = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }
        sum /= count;
        System.out.println("Ortalamanız:" + sum);
    }
}
