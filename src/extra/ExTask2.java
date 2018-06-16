package extra;

/* 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
        тельные заменить на 0. */

import java.util.Scanner;

public class ExTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three integer numbers, please: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a >= 0) {
            a = a * a * a;
            System.out.println("First number - " + a);
        }
        else {
            a = 0;
            System.out.println("First number - " + a);
        }
        if (b >= 0) {
            b = b * b * b;
            System.out.println("Second number - " + b);
        }
        else {
            b = 0;
            System.out.println("Second number - " + b);
        }
        if (c >= 0) {
            c = c * c * c;
            System.out.println("Third number - " + c);
        }
        else {
            c = 0;
            System.out.println("Third number - " + c);
        }
    }
}