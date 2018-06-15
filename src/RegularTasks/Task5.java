package RegularTasks;

import java.util.Scanner;

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
