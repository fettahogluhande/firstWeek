import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        int n1, n2;
        int ebob = 1, ekok=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n1: ");
        n1 = input.nextInt();
        System.out.print("Enter n2: ");
        n2 = input.nextInt();

        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;

            /*
            System.out.println(n1);
            System.out.println(n2);
             */
        }

        int i = 1;
        while (i < n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.print("Ebob: " + ebob);
        System.out.println();

        int k = 1;
        while (k <= n1 * n2) {
            if (k % n1 == 0 && k % n2 == 0) {
                ekok = k;
                break;
            }
            k++;
        }
        System.out.print("Ekok: " + ekok);

    }
}
