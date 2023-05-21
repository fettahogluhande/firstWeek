import java.util.Scanner;

public class cinzodyak {
    public static void main(String[] args) {
        //Değişkenler
        int age;
        String horoscope = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz:");
        age = input.nextInt();

        if (age % 12 == 0) {
            horoscope = "Maymun";
        } else if (age % 12 == 1) {
            horoscope = "Horoz";
        } else if (age % 12 == 2) {
            horoscope = "Köpek";
        } else if (age % 12 == 3) {
            horoscope = "Domuz";
        } else if (age % 12 == 4) {
            horoscope = "Fare";
        } else if (age % 12 == 5) {
            horoscope = "Öküz";
        } else if (age % 12 == 6) {
            horoscope = "Kaplan";
        } else if (age % 12 == 7) {
            horoscope = "Tavşan";
        } else if (age % 12 == 8) {
            horoscope = "Ejderha";
        } else if (age % 12 == 9) {
            horoscope = "Yılan";
        } else if (age % 12 == 10) {
            horoscope = "At";
        } else if (age % 12 == 11) {
            horoscope = "Koyun";
        } else {
            System.out.println("Hesaplanamadı!");
        }

        System.out.print("Çin zodyağı burcunuz:" + horoscope);
    }
}
