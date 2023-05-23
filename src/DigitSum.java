import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {

        int num, tempNum, digitValue, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = input.nextInt();

        tempNum = num;
        while (tempNum != 0) {
            digitValue = tempNum % 10;
            tempNum /= 10;
            result += digitValue;
        }
        System.out.println(result);
    }
}
