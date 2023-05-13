import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int x , y , select;
        Scanner input = new Scanner(System.in);
        System.out.print("x:");
        x = input.nextInt();
        System.out.print("y:");
        y = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Seçiminiz:");
        select = input.nextInt();

        switch (select){
            case 1 :
                System.out.println("Toplama: "+(x+y));
                break;
            case 2 :
                System.out.println("Çıkarma: "+(x-y));
                break;
            case 3 :
                if(y != 0){
                    System.out.print("Bölme:" +(x/y));
                }
                else {
                    System.out.println("Bölme yapılamaz !");
                }
                break;
            case 4 :
                System.out.print("Çarpma:" +(x*y));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız !");
        }

    }
}
