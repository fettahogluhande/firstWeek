import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num, tempNum, digitNum = 0, digitValue, digitPow, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = input.nextInt();

        tempNum = num;

        //Girilen sayının kaç basamak olduğunu bulma.
        while (tempNum != 0) {
            tempNum /= 10;
            digitNum++;
        }

        tempNum = num;

        while (tempNum != 0) {
            digitValue = tempNum % 10;
            //System.out.println(digitValue);
            digitPow = 1;
            for (int i = 1; i <= digitNum; i++) {
                digitPow *= digitValue;
            }
            result += digitPow;
            tempNum /= 10;
        }



        if(result == num){
            System.out.println(result+" armstrong sayıdır!");
        } else {
            System.out.println(result+" armstrong sayı değildir!");
        }

    }
}
