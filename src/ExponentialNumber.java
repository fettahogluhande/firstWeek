import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        int n, r, total = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = input.nextInt();
        System.out.print("Enter r: ");
        r = input.nextInt();

        for (int i = 1; i <= r; i++) {
            total *= n;
        }
        System.out.println("Answer: " + total);
    }
}
