package RegularTasks;

import java.util.Scanner;

/*
4. Вводимо число з плаваючою точкою і перевіряємо чи це число в діапазоні від 0 до 1.
*/

public class Task4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter fractional number, please: ");
        double number = scan.nextDouble();

        if (number >= 0.0 & number <= 1.0)
        {
            System.out.println("The number " + number + " is between 0 and 1");
        }
        else
            {
                 System.out.println("The number " + number + " is out of bounds");
            }
    }
}
