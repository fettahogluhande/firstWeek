import java.util.Scanner;

public class ATMproject {
    public static void main(String[] args) {
        int balance = 1500, select, right = 3, price;
        String username, password;
        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Kullanıcı adı: ");
            username = input.nextLine();

            System.out.print("Şifre: ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("123")) {
                System.out.println("Sisteme giriş yaptınız.");
                do {
                    System.out.println(
                            """
                                    1-Bakiye Sorgula
                                    2-Para Yatırma
                                    3-Para Çekme
                                    4-Çıkış Yap""");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();


                    switch (select) {
                        case 1 -> {
                            System.out.print("Güncel Bakiyeniz: " + balance);
                            System.out.println();
                        }
                        case 2 -> {
                            System.out.print("Yatırılacak miktarı giriniz: ");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("Güncel bakiyeniz: " + balance);
                        }
                        case 3 -> {
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Limiti aştınız!");
                            } else {
                                balance -= price;
                                System.out.println("Güncel bakiyeniz: " + balance);
                            }
                        }
                        case 4 -> System.out.println("Güvenli çıkış yaptınız!");
                        default -> System.out.println("Hatalı girş yaptınız");
                    }
                } while (select != 4);
                break;
            } else {
                --right;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur");
                } else {
                    System.out.println("Hatalı giriş yaptınız! Kalan hakkınız:" + right);
                }
            }
        }

    }
}
