package RegularTasks;

import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter time, please (0 - 24): ");
        int time = scan.nextInt();

        if (time >= 0 && time <= 24)
        {
            if (time >= 9 && time <= 18)
            {
                System.out.println("I am at work");
            } else
                {
                    System.out.println("I rest");
                }
        } else
            {
                System.out.println("Incorrect input");
            }
    }
}