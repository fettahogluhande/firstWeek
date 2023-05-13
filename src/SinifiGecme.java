import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        int math,physics,turkish,chemistry,music;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        math = input.nextInt();
        if(math < 0 || math > 100){
            System.out.println("Geçersiz matematik notu girdiniz.");
            math = 0;
        }
//**********************************************************************
        System.out.print("Fizik notunuz: ");
        physics = input.nextInt();
        if(physics < 0 || physics > 100){
            System.out.println("Geçersiz fizik notu girdiniz.");
            physics = 0;
        }
//*********************************************************************
        System.out.print("Türkçe notunuz: ");
        turkish = input.nextInt();
        if(turkish <0 || turkish>100 ){
            System.out.println("Geçersiz türkçe notu girdiniz.");
            turkish = 0;
        }
//********************************************************************
        System.out.print("Kimya notunuz: ");
        chemistry = input.nextInt();
        if(chemistry<0 || chemistry>100){
            System.out.println("Geçersiz türkçe notu girdiniz.");
            chemistry=0;
        }
//*******************************************************************
        System.out.print("Müzik notunuz: ");
        music = input.nextInt();
        if(music<0 || music>100){
            System.out.println("Geçersiz müzik notu girdinmiz.");
            music =0;
        }
//**********************************************************************
        average = (math+physics+turkish+chemistry+music)/5;

        if(average<=55){
            System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere...");
        }else{
            System.out.println("Tebrikler geçtiniz.");
        }
        System.out.print("Ortalamnız: "+average);
    }
}
