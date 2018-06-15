package regular;

import java.util.Scanner;

/*
7. Вводимо два числа, якшо одне з них ділить без залишку на інше, то виводимо true і показуємо результат ділення.
        В іншому випадку виводимо false і результат ділення (цілу частину і залишок).
*/

public class Task7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers, please: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        boolean isDivisable = false;

        if (num1 % num2 == 0) {
            System.out.println(!isDivisable);
            System.out.println("The result of divisible " + (num1 / num2));
        }
        else if (num2 % num1 == 0) {
            System.out.println(!isDivisable);
            System.out.println("The result of divisible " + (num2 / num1));
        }
        else if (num1 % num2 != 0) {
            System.out.println(isDivisable);
            System.out.println("The result of divisible " + num1 / num2 + "," + num1 % num2);
        }
    }
}
