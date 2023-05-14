import java.util.Scanner;

public class PlanePrice {
    public static void main(String[] args) {

        int distance, age, way;
        double total;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz:");
        distance = input.nextInt();

        System.out.print("Yaşınızı giriniz:");
        age = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz(1 => Tek yön,2 => Gidiş-Dönüş):");
        way = input.nextInt();

        if((distance>0)&&(age>0)&&(way==1)||(way==2)){
            total = distance * 0.10;

            if(age<12){
                total -= total * 0.5;
            } else if ((age>=12)&&(age<24)) {
                total -= total * 0.1;
            } else if (age>=65) {
                total -= total * 0.3;
            }
            if(way ==2){
                total-=total*0.2;
                total *= 2;
            }
            System.out.println("Toplam Tutar:"+total+"TL");
        }else {
            System.out.println("Hatalı veri girdiniz!");
        }

    }
}
