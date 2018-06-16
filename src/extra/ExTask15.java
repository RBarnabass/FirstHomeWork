package extra;

/* 15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
        квадрат; б) уместится ли квадрат в круге. */

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ExTask15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter circle are and square area, please: ");
        double circleArea = scan.nextDouble();
        double squareArea = scan.nextDouble();

        if (sqrt(circleArea) / 2 == sqrt(squareArea / 4)) {
            System.out.println("The square can hold circle in");
        }
        else if (sqrt(2 * circleArea) / 2 == sqrt(squareArea / 2)) {
            System.out.println("The circle can hold square in");
        }
        else {
            System.out.println("Sorry! We have no options for your shapes");
        }
    }
}
