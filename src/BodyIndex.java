import java.util.Scanner;

public class BodyIndex {
    public static void main(String[] args) {
        //Değişkenleri tanımla
        double boy , kilo ,formul;

        //Kullanıcıdan boy ve kilo değerlerini al
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo = input.nextDouble();

        //Vücut kitle indeksi formülünü kullanarak hesapla
        formul = kilo / (boy * boy);
        System.out.print("Vücut kitle indeksiniz: "+formul);

    }
}
