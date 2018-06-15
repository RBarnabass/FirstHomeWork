package regular;

/*
13. Дано натуральне число А > 1. Вирахувати яким по рахунку числом Фібоначі воно являється.
        Тобто введіть так число n , щоб φn=A.Якшо А не являєтся числом Фібоначі, виведіть число -1.
*/

import java.util.Scanner;

public class Task13
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number, please: ");
        int num = scan.nextInt();
        int fibAbs = 0, fib2 = 1, fib3 = 1;
        int count = 3;

        if (num > 1)
        {
            while (fibAbs < num)
            {
                fibAbs = fib2 + fib3;
                fib2 = fib3;
                fib3 = fibAbs;
                count++;
            }

            if (fibAbs > num)
            {
                System.out.println("-1");
            }
            else
                {
                    System.out.println(count);
                }
        }
    }
}