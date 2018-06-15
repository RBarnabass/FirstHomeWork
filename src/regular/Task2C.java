package regular;

import java.util.Scanner;

/*
2. Користувач вводить три числа з консолі - потрібно вивести на консоль найбільше і найменше.
*/

public class Task2C
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

            for (int i = 0; i < data.length - 1; i++)
            {
                for (int j = i + 1; j < data.length; j++)
                {
                    if (data[i] > data[j])
                    {
                        int tmp = data[i];
                        data[i] = data[j];
                        data[j] = tmp;
                    }
                }
            }
            System.out.println("Minimum number is: " + data[0]);
            System.out.println("Maximum number is: " + data[data.length - 1]);
        }
}
