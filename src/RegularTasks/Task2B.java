package RegularTasks;

import java.util.Scanner;

public class Task2B
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three integer numbers, please: ");
        int[] data = new int[3];

        for (int i = 0; i < data.length; i++)
        {
            data[i] = scan.nextInt();
        }

        int max = data[0];
        int min = data[0];
        for (int i = 0; i < data.length; i++)
        {
            if (max < data[i])
            {
                max = data[i];
            }
        }
        System.out.println("Maximum number is: " + max);

        for (int i = 0; i < data.length; i++)
        {
            if (min > data[i])
            {
                min = data[i];
            }
        }
        System.out.println("Minimum number is: " + min);
    }
}
