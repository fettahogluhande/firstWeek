import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        //Değişkenleri tanımla
        int r ,a;
        double alan , cevre ,pi = 3.14;

        //Kullanıcıdan yarıçapı ve merkez açısının değerini al
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açısının ölçüsünü girin: ");
        a = input.nextInt();

        //Dairenin alanı ve çevresini hesapla
        alan = (pi * r * r * a)/360;
        cevre = 2 * pi * r ;

        //Outputlar
        System.out.println("Dairenin alanı:" +alan);
        System.out.println("Dairenin çevresi:" +cevre);
    }
}
