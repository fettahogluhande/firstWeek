import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        String month, horoscope = null;
        int day;
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum ayınız:");
        month = input.nextLine();
        System.out.print("Doğum gününüz:");
        day = input.nextInt();


        if (month.equalsIgnoreCase("Ocak")) {
            if ((day > 1) && (day < 31)) {
                if (day < 21) {
                    horoscope = "Oğlak";
                } else {
                    horoscope = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Şubat")) {
            if ((day > 1) && (day < 28)) {
                if (day < 19) {
                    horoscope = "Kova";
                } else {
                    horoscope = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Mart")) {
            if ((day > 1) && (day < 31)) {
                if (day < 20) {
                    horoscope = "Balık";
                } else {
                    horoscope = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Nisan")) {
            if ((day > 1) && (day < 30)) {
                if (day < 20) {
                    horoscope = "Koç";
                } else {
                    horoscope = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Mayıs")) {
            if ((day > 1) && (day < 31)) {
                if (day < 21) {
                    horoscope = "Boğa";
                } else {
                    horoscope = "İkizler";
                }
            }
        } else if (month.equalsIgnoreCase("Haziran")) {
            if ((day > 1) && (day < 30)) {
                if (day < 22) {
                    horoscope = "İkizler";
                } else {
                    horoscope = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Temmuz")) {
            if ((day > 1) && (day < 31)) {
                if (day < 22) {
                    horoscope = "Yengeç";
                } else {
                    horoscope = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Ağustos")) {
            if ((day > 1) && (day < 31)) {
                if (day < 22) {
                    horoscope = "Aslan";
                } else {
                    horoscope = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Eylül")) {
            if ((day > 1) && (day < 30)) {
                if (day < 22) {
                    horoscope = "Başak";
                } else {
                    horoscope = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Ekim")) {
            if ((day > 1) && (day < 31)) {
                if (day < 22) {
                    horoscope = "Terazi";
                } else {
                    horoscope = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Kasım")) {
            if ((day > 1) && (day < 30)) {
                if (day < 21) {
                    horoscope = "Akrep";
                } else {
                    horoscope = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (month.equalsIgnoreCase("Aralık")) {
            if ((day > 1) && (day < 31)) {
                if (day < 21) {
                    horoscope = "Yay";
                } else {
                    horoscope = "Oğlak";
                }
            } else {
                isError = true;
            }
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız!");
        } else {
            System.out.println("Burcunuz:" + horoscope);
        }
    }
}
