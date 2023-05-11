import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //Değişkenleri tanımla.
        double a ,b ,c ,u ,alan;

        //Kullanıcıdan üçgenin kenar uzunluklarını al.
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        b = input.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        c = input.nextInt();

        //Alanı hesapla
        u = (a + b + c)/2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        //Output
        System.out.println("Alan:"+alan);
    }
}
