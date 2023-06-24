import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean asal;
        int i, j;
        System.out.println("1-100 arasındaki asal sayılar");

        for (i = 2; i <= 100; i++) {
            asal = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0){
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println(i);
            }
        }


    }
}
