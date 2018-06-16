package extra;

/* 10) Написать программу вычисления стоимости переговоров, если по суббо-
        там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
        ность разговора и день недели (цифра от 1 до 7). */

import java.util.Scanner;

public class ExTask10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter duration of negotiations (minutes) and day of week (1-7), please: ");
        double lenght = scan.nextDouble();
        double weekDay = scan.nextDouble();
        double rPrice = 0.05;

        if (lenght >= 0) {
            if (weekDay <= 0 || weekDay > 7) {
                System.out.println("Incorrect day input");
            } else if (weekDay > 5) {
                System.out.println("It's will cost for you: " + lenght * (rPrice - rPrice * 0.2));
            } else {
                System.out.println("It's will cost for you: " + lenght * rPrice);
            }
        }
    }
}
