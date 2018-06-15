package regular;

/*
11. Вирахувати факторіал числа, яке вводить користувач.
*/

import java.util.Scanner;

public class Task11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number, please: ");
        int num = scan.nextInt();
        int tmp;
        int factorial = 1;

        if (num < 0)
        {
            System.out.println("Incorrect value!");
        }
        else
            {
            for (int i = 0; i < num; i++)
            {
                tmp = num - i;
                factorial *= tmp;
            }
            System.out.println("The factorial of your number is: " + factorial);
        }
    }
}


