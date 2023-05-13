import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        //Değişkenleri tanımla
        String userName, password ,reset;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız:");
        userName = input.nextLine();
        System.out.print("Şifreniz:");
        password = input.nextLine();


        if(userName.equals("patika") && password.equals("Java123")){
            System.out.println("Giris yaptınız!");
        }else{
            System.out.println("Bilgileriniz hatalı!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz(Evet/Hayır)");
            reset = input.nextLine();

            if(reset.equalsIgnoreCase("Evet")){
                System.out.print("Yeni şifreniz:");
                String newpassword = input.nextLine();

                if(newpassword.equals(password)){
                    System.out.print("Şifre oluşturulamadı.Lütfen başka şifre giriniz");
                } else{
                    System.out.print("Yeni şifreniz oluşturuldu!");
                }

            } else {
                System.out.print("Şifrenizi sıfırlamak istemediniz");
            }
        }
    }
}
