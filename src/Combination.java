import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n,r, count = 1,count1=1,count2=1,total;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n:");
        n = input.nextInt();

        System.out.print("Enter r:");
        r = input.nextInt();

        //n!'in değeri hesaplandı
        for (int i = 1 ;i<=n;i++){
            count *= i;
        }
        //System.out.println("n!:"+count);

        //r!'in değeri hesaplandı
        for (int i = 1;i<=r;i++){
            count1 *= i;
        }
        //System.out.println("r!:"+count1);

        //(n-r)!'in değeri hesaplandı
        int i=1;
        while(i<=n-r){
            count2 *= i;
            i++;
        }
        //System.out.println("(n-r)!:"+count2);

        //Kombinasyon formülünde değerler yerine koyuldu
        total = (count/(count1*count2));
        System.out.println("n!/n!(n-r)!:"+total);

    }
}
