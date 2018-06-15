package RegularTasks;

import java.util.Scanner;

/*
2. Користувач вводить три числа з консолі - потрібно вивести на консоль найбільше і найменше.
*/

public class Task2A
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three integer numbers, please: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3)
        {
            System.out.println("Maximum number is: " + num1);
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            System.out.println("Maximum number is: " + num2);
        }
        else if (num3 >= num1 && num3 >= num2)
        {
            System.out.println("Maximum number is: " + num3);
        }

        if (num1 <= num2 && num1 <= num3)
        {
            System.out.println("Minimum number is: " + num1);
        }
        else if (num2 <= num1 && num2 <= num3)
        {
            System.out.println("Minimum number is: " + num2);
        }
        else if (num3 <= num1 && num3 <= num2)
        {
            System.out.println("Minimum number is: " + num3);
        }
    }
}
