package extra;

import java.util.Scanner;

/*
1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
        лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
*/

public class ExTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three sides of triangle, please: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double tmpHipo = 0, kat1 = 0, kat2 = 0;

        if (a > b && a > c) {
            tmpHipo = a; kat1 = b; kat2 = c;
        }
        else if (b > a && b > c) {
            tmpHipo = b; kat1 = a; kat2 = c;
        }
        else if (c > a && c > b) {
            tmpHipo = c; kat1 = a; kat2 = b;
        }
        else {
            System.out.println("The triangle is definitely not orthogonal");
        }

        if (tmpHipo > 0) {
            if (tmpHipo * tmpHipo == kat1 * kat1 + kat2 * kat2) {
                System.out.println("The triangle is orthogonal");
            }
            else {
                System.out.println("The triangle is not orthogonal");
            }
        }
    }
}
