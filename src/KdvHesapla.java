import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {

        //Değişkenleri tanımla
        double tutar , kdvorani , kdvlitutar , kdvtutari;

        //Kullanıcıdan tutarı al
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün fiyatını girin:");
        tutar = input.nextDouble();

        //Ürünün KDV'li fiyatını hesapla
        kdvorani = (tutar > 1000) ? 0.8 : 0.18;
        kdvtutari = tutar * kdvorani;
        kdvlitutar = tutar + kdvtutari;



        //Outputlar
        System.out.println("        ****");
        System.out.println("Ürünün fiyatı:"+tutar);
        System.out.println("KDV oranı:"+kdvorani);
        System.out.println("Ürüne eklenecek KDV fiyatı:"+kdvtutari);
        System.out.println("Ürünün KDV'li fiyatı:"+kdvlitutar);
    }
}
