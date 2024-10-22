package homework7;

import java.util.Scanner;

/**
 * Print Day of the Week using switch
 */
public class DayOfWeek13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //user to enter a number between 1 and 7
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();

        // Use switch statement

        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default: // If the number is not between 1 and 7
                System.out.println("Week contains 1 to 7 days");
        }
    }

}
