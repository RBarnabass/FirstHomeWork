package RegularTasks;

import java.util.Scanner;

/*
3. Користувач вводить число. Вивести на екран його подвоєне значення, якшо число ділиться на 7 без залишку.
*/

public class Task3
{
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter integer number, please: ");
            int number = scan.nextInt();

            if (number % 7 == 0)
            {
                System.out.println(number * number);
            }
            else
            {
                System.out.println("This number isn't divisible seven");
            }
    }
}
