package regular;

import java.util.Scanner;

/*
5. Вводимо 2 числа. Якшо перше число більше другого, то виводимо на консоль різницю цих чисел.
        В іншому випадку то виводимо добуток
*/

public class Task5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers, please: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 > num2)
        {
            System.out.println("This is difference of your numbers: " + (num1 - num2));
        }
        else
        {
            System.out.println("This is product of your numbers: " + (num1 * num2));
        }
    }
}
