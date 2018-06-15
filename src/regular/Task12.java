package regular;

/*
12. Вирахувати число фібоначі по номеру послідовності, який вводить користувач.
        φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
        По даному числу n вирахувати n-є число Фібоначі φn.
*/

import java.util.Scanner;

public class Task12
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number, please: ");
        int num = scan.nextInt();
        int fibAbs = 0, fib1 = 1, fib2 = 1;

        if (num <= 0)
        {
            System.out.println("Incorrect input");
        }
        else if (num == 1)
        {
            System.out.println("Your Fibonacci number is " + fibAbs);
        }
        else if (num == 2 || num == 3)
        {
            System.out.println("Your Fibonacci number is " + fib1);
        }
        else
        {
            for (int i = 3; i < num; i++)
            {
                fibAbs = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibAbs;
            }
            System.out.println("Your Fibonacci number is: " + fibAbs);
        }
    }
}
