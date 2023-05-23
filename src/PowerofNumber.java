import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        int num,i=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = input.nextInt();

        System.out.println("Girilen sayıya kadar 4'ün kuvvetleri:");
        while (i <= num) {
            System.out.print(i + " ");
            i *= 4;
        }

        System.out.println();

        System.out.println("Girilen sayıya kadar 5'in kuvvetleri:");
        for (i=1;i<=num;i*=5){
            System.out.print(i +" ");
        }

    }
}
