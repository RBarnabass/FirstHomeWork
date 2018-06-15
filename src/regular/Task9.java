package regular;

import java.util.Scanner;

/*
9. Порахувати скільки разів зустрічається 5 в заданому числі, яке вводить користувач

        435  -   1
        505  -   2
        555  -   3
        305    - 1
*/

public class Task9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number, please: ");
        int number = scan.nextInt();
        int quantity = 0;
        int tmp1 = number;

        while (tmp1 > 0) {
            tmp1 = tmp1 / 10;
            int tmp2 = number % 10;
            number = (number - tmp2) / 10;

            if (tmp2 == 5) {
                quantity++;
            }
        }
        System.out.println("Your number contains " + quantity + " numbers '5'");
    }
}
