package RegularTasks;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers, please: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = num1 + num2;

        if (sum <= 19 & sum >= 11)
        {
            System.out.println("The sum of your number is: " + sum);
        }
        else
        {
            System.out.println("The sum of your number is out of bonds");
        }
    }
}
