package homework7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // A year is a leap year if it's divisible by 4 but not divisible by 100,
        // unless it's also divisible by 400.

        boolean isLeap = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);

        if (isLeap){
            System.out.println(year + " is a Leap year.");
        }else {
            System.out.println(year + "is not a leap year.");
        }
    }

}
