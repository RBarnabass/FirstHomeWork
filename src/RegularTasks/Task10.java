package RegularTasks;

import java.util.Scanner;

/*
10. Перевести чило з десятичної системи в двійкову і навпаки. Користувач вводить число
*/

public class Task10
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number, please: ");
        int num = scan.nextInt();

        String two = Integer.toBinaryString(num);
        System.out.println("Your number in binary system: " + two);
        System.out.println("Your number recovered - " + Integer.parseInt(two, 2));
    }
}
