package extra;

/* 13) Даны три числа A,B,C. Увеличить числа в два
        раза, если A+B+C>0, в противном случае заменить
        на нули. */

import java.util.Scanner;

public class ExTask13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter wind speed, please: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a + b + c > 0) {
            System.out.println("A - " + a * 2 + " , B - " + b * 2 + " , C - " + c * 2);
        }
        else {
            System.out.println("A - " + (a = 0) + " , B - " + (b = 0) + " , C - " + (c = 0));
        }
    }
}
