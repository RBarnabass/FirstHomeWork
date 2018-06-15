package RegularTasks;

import java.util.Scanner;

public class Task8
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers, please: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        boolean isEqual = true;
        int lastNumber1 = num1 % 10;
        int lastNumber2 = num2 % 10;

        if (lastNumber1 == lastNumber2)
        {
            System.out.println(isEqual);
        }
        else
        {
            System.out.println(!isEqual);
        }
    }
}