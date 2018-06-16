package extra;

/* 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
        одинаковые; б) есть ли среди его цифр одинаковые. */

import java.util.Scanner;

public class ExTask3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three considerable number, please: ");
        int number = scan.nextInt();

        if (number > 99 && number < 1000) {
            int tmp1 = number % 10;
            number = (number - tmp1) / 10;
            int tmp2 = number % 10;
            number = (number - tmp2) / 10;
            int tmp3 = number;

            if (tmp1 == tmp2 && tmp1 == tmp3) {
                System.out.println(true);
                System.out.println("There are three numbers equal");
            } else if (tmp1 == tmp2 || tmp1 == tmp3 || tmp2 == tmp3) {
                System.out.println(true);
                System.out.println("There are two numbers equal");
            } else {
                System.out.println(false);
                System.out.println("There is no equal numbers");
            }
        } else {
            System.out.println("The number must be more than ten");
        }
    }
}
