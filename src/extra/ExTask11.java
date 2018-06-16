package extra;

/* 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
        добавляет к нему слово "копейка" в правильной форме. Например, 1
        копейка, 5 копеек, 42 копейки . */

import java.util.Scanner;

public class ExTask11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter coins quantity (1-99), please: ");
        int lenght = scan.nextInt();

        if (lenght <= 0 || lenght > 99) {
            System.out.println("Incorrect input");
        }
        else if (lenght == 1 || lenght == 21 || lenght == 31 || lenght == 41 || lenght == 51 || lenght == 61 || lenght == 71 || lenght == 81 || lenght == 91) {
            System.out.println(lenght + " копійка");
        }
        else if (lenght < 5 || lenght > 21 && lenght < 25 || lenght > 31 && lenght < 35 || lenght > 41 && lenght < 45 || lenght > 51 && lenght < 55 || lenght > 61 && lenght < 65 || lenght > 71 && lenght < 75 || lenght > 81 && lenght < 85 || lenght > 91 && lenght < 95 ) {
            System.out.println(lenght + " копійки");
        }
        else if (lenght > 5 && lenght < 21 || lenght > 24 && lenght < 31 || lenght > 34 && lenght < 41 || lenght > 44 && lenght < 51 || lenght > 54 && lenght < 61 || lenght > 64 && lenght < 71 || lenght > 74 && lenght < 81 || lenght > 84 && lenght < 91 || lenght > 94) {
            System.out.println(lenght + " копійок");
        }
    }
}
