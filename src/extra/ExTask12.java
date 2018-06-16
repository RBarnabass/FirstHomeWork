package extra;

/* 12) Написать программу, которая в зависимости от характера ветра выдает
        сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
        умеренный (2); от 11-18 м/c - сильный (3); больше 19 м/c - ураганный (4). */

import java.util.Scanner;

public class ExTask12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter wind speed, please: ");
        double speed = scan.nextDouble();

        if (speed <= 0) {
            System.out.println("We have not comments for you");
        }
        else if (speed < 5) {
            System.out.println("The wind is weak");
        }
        else if (speed < 11) {
            System.out.println("The wind is temperate");
        }
        else if (speed < 19) {
            System.out.println("The wind is strong");
        }
        else {
            System.out.println("There is hurricane");
        }
    }
}
