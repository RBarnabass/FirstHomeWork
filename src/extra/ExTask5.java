package extra;

/* 5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна пара равных */

import java.util.Scanner;

public class ExTask5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers, please: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if (a == b || a == c) {
            System.out.println("We have equal pair");
        }
        else if (b == c) {
            System.out.println("We have one equal pair");
        }
        else {
            System.out.println("There are no pairs");
        }
    }
}
