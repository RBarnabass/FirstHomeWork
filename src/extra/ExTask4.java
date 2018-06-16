package extra;

/* 4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
        ду. Какая из них больше? */

import java.util.Scanner;

public class ExTask4 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter speed, please");
            System.out.println("First speed suppose to be in km/hour - ");
            double kmHour = scan.nextDouble();
            System.out.println("Second speed suppose to be in m/sec - ");
            double mSeconds = scan.nextDouble();

            if (kmHour >= 0 && mSeconds >= 0) {
                double mSeconds2 = (kmHour * 1000) / 3600;

                if (mSeconds > mSeconds2) {
                    System.out.println("Speed in m/sec is higher");
                } else if (mSeconds2 == mSeconds) {
                    System.out.println("They are equal");
                } else {
                    System.out.println("Speed in km/hour is higher");
                }
            }
        }
    }
