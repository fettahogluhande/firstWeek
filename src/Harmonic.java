import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        int num;
        double result = 0;

        //Kullanıcıdan bir sayı alındı
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        //Harmonik ortalama = 1 + 1/2 + 1/3 + ....
        for (int i = 1; i <= num; i++) {
            result += (1.0 / i);
        }
        System.out.println("Sonuç:" + result);
    }
}
