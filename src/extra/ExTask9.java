package extra;

/* 9) Написать программу вычисления идеального веса пользователя (рост-
        100). Выдать рекомендации о необходимости поправиться либо поху-
        деть. */

import java.util.Scanner;

public class ExTask9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your height (m), please: ");
        double height = scan.nextDouble();
        double weightLow = 20 * height * height;
        double weightHigh = 25 * height * height;

        System.out.println("The best weight for you is from " + weightLow + " to " + weightHigh);
    }
}
