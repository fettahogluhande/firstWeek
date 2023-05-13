import java.util.Scanner;

public class Tempreture {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz:");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat < 25) {
            System.out.println("Piknik yapmaya gidebilirsiniz.");
        } else if (heat < 30) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        } else {
            System.out.println("Hatalı sıcaklık değeri girildi.");
        }

    }
}
