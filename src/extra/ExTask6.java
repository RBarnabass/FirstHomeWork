package extra;

/* 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания */

import java.util.Scanner;

public class ExTask6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed (km/hour) and distance (km), please: ");
        double speed = scan.nextDouble();
        double distance = scan.nextDouble();
        double time = distance / speed;
        System.out.println("You need " + time + " hours to manage this distance");
    }
}
