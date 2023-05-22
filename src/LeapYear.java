import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        year = input.nextInt();


        if (year % 100 == 0) {

            if (year % 400 == 0) { //year 100'ün katı ve 400'e tam bölünüyorsa artık yıldır
                System.out.println(year + " artık bir yıldır!");

            } else { //year 100'ün katı ama 400'e tam bölünemiyorsa artık yıl değildir
                System.out.println(year + " artık bir yıl değildir!");
            }
        } else if (year % 4 == 0) { //year 4'ün tam katı ise artık yıldır
            System.out.println(year + " artık bir yıldır!");
        } else {
            System.out.println(year + " artık bir yıl değildir!");
        }
    }
}
