package RegularTasks;

import java.util.Scanner;

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
