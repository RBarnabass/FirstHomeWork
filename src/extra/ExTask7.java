package extra;

/* 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
        времени года. Если пользователь введет недопустимое число, программа
        должна выдать сообщение об ошибке. */

import java.util.Scanner;

public class ExTask7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month's number, please: ");
        int month = scan.nextInt();

        if (month <= 0 || month > 12) {
            System.out.println("The number is out of bonds !");
        }
        else if (month == 12 || month <= 2) {
            System.out.println("The winter is outside");
        }
        else if (month <= 5) {
            System.out.println("The spring is outside");
        }
        else if (month <= 8) {
            System.out.println("The summer is outside");
        }
        else {
            System.out.println("The autumn is outside");
        }
    }
}
