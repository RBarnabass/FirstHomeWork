package RegularTasks;

import java.util.Scanner;

public class Task9
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number, please: ");
        int number = scan.nextInt();
        int circles = 0;
        int quantity = 0;
        int tmp1 = number;

        // We count how much numbers is entrance number
        while (tmp1 > 0)
        {
            tmp1 = tmp1 / 10;
            ++circles;
        }

        // We divide entrance number to numbers and safe it in temporary variable
        for (int i = 0; i < circles; i++)
        {
            int tmp2 = number % 10;
            number = (number - tmp2) / 10;

            if (tmp2 == 5) // We count how much "5's" was in our temporary variable
            {
                quantity++;
            }
        }
        System.out.println("Your number contains " + quantity + " numbers '5'");
    }
}
