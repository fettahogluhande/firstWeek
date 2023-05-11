import  java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        //Değişkenleri tanımla
        int km ,startprice = 10;
        double perkm = 2.20,total,result;

        //Kullanıcıdan km'yi al
        Scanner input = new Scanner(System.in);
        System.out.print("km'yi giriniz:");
        km = input.nextInt();

        //Toplam fiyatı bul
        total = startprice + (km * perkm);
        result = (total < 20) ? 20 : total;

        //Output
        System.out.println(result);
    }
}
