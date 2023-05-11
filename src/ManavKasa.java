import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        //Değişkenleri tanımla
        double armut = 2.14 , elma = 3.67 , domates = 1.11, muz = 0.95 ,patlican = 5 ,total;
        int a ,e ,d, m , p ;

        //Kullanıcıdan meyvelerin kaç kilo olduğunu öğren
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo ?:");
        a = input.nextInt();
        System.out.print("Elma kaç kilo ?:");
        e = input.nextInt();
        System.out.print("Domates kaç kilo ?:");
        d = input.nextInt();
        System.out.print("Muz kaç kilo ?:");
        m = input.nextInt();
        System.out.print("Patlıcan kaç kilo ?:");
        p = input.nextInt();


        total = a * armut +
                e * elma +
                d * domates +
                m * muz +
                p * patlican ;
        
        System.out.print("Toplam:"+total);

    }
}
