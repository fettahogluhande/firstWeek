import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        int num,sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = input.nextInt();

        //Çarpanlarını bulma
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum = "+sum);

        if(sum == num){
            System.out.println(num + " is a perfect number!");
        }else{
            System.out.println(num + " is not a perfect number!");
        }
    }
}
