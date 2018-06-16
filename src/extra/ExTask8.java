package extra;

/* 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
        тавляется, если сумма покупки превышает 1000 гривен. */

import java.util.Scanner;

public class ExTask8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price, please: ");
        double price = scan.nextDouble();

        if (price > 1000) {
            double newPrice = price - price * 0.1;
            System.out.println("Your new price is: " + newPrice + " UAH");
        }
        else {
            System.out.printf("There is no discount for you! Sorry");
        }
    }
}
