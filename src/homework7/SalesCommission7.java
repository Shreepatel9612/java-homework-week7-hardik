package homework7;
/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 */

import java.util.Scanner;

public class SalesCommission7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input Sales information
        System.out.print("Enter Sales Id: ");
        int salesId = scanner.nextInt();
        System.out.print("Enter Seller Name: ");
        String sellerName = scanner.next();
        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate commission based on sales amount
        double commission = 0;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Display result
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Commission: $" + commission);
    }
}





