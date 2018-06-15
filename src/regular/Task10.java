package regular;

import java.util.Scanner;

/*
10. Перевести чило з десятичної системи в двійкову і навпаки. Користувач вводить число
*/

public class Task10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number, please: ");
        int num = scan.nextInt();
        int tmp = num;
        String number = "";
        String newNum = "";
        int reverse = 0;
        int d = 1;

        while (tmp > 0) {
            if (tmp % 2 == 0) {
                tmp = tmp / 2;
                number += 0;
            } else if (tmp % 2 != 0) {
                tmp = tmp / 2;
                number += 1;
            }
        }

        for (int i = number.length() - 1; i >= 0; i--) {
            char tempo = number.charAt(i);
            newNum += tempo;
        }

        System.out.println(Integer.parseInt(newNum));

        for (int i = 0; i < number.length(); i++) {
            char tempo = number.charAt(i);
            String ff = Character.toString(tempo);
            int temporrr = Integer.parseInt(ff);
            int k = (temporrr * d);
            reverse += k;
            d = d * 2;
        }
        System.out.println(reverse);
    }
}
