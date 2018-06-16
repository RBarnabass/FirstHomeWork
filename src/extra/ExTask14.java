package extra;

/* 14) Определить, является ли шестизначное число "счастливым" (сумма
        первых трех цифр равна сумме последних трех цифр). */

import java.util.Scanner;

public class ExTask14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter six considerable number, please: ");
        int number = scan.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                int tmp1 = number % 10;
                number = (number - tmp1) / 10;
                sum1 += tmp1;
            }
            else {
                int tmp2 = number % 10;
                number = (number - tmp2) / 10;
                sum2 += tmp2;
            }
        }

        if (sum1 == sum2) {
            System.out.println("There is lucky number");
        }
        else {
            System.out.println("There is unlucky number");
        }
    }
}
