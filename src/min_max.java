import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        int num, k, min = 0, max = 0;
        Scanner input = new Scanner(System.in);
        //Kaç tane sayı gireceksiniz?
        System.out.print("Kaç tane sayı gireceksiniz?:");
        num = input.nextInt();

        //Girilen sayıları karşılaştırarak en büyük ve en küçüğünü bulma
        for (int i = 1; i <= num; i++) {
            System.out.print(i + ".sayıyı giriniz: ");
            k = input.nextInt();

            if (i == 1){
                min = k;
                max = k;
            }
            if (k > max) {
                max = k;
            }
            if (k < min) {
                min = k;
            }
        }
            System.out.println("En büyük sayı: " + max);
            System.out.println("En küçük sayı: " + min);

    }
}
