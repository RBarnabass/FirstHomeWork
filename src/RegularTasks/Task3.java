package RegularTasks;

import java.util.Scanner;

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
