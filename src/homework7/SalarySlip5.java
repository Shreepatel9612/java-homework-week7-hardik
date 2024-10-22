package homework7;

import java.util.Scanner;

/**
 *
 * Java Program for Employee Salary Slip
 */

public class SalarySlip5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextInt(); //To consume the remaining newline
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        //Calculate HRA, TA, DA, PF, and Gross Salary
        double HRA = basicSalary * 0.10;
        double TA = basicSalary * 0.09;
        double DA = basicSalary * 0.08;
        double PF = basicSalary * 0.20;
        double grossSalary = basicSalary + HRA + TA + DA - PF;

        //Print salary slip
        System.out.println("_______________________________________________");
        System.out.println("|         Salary Slip                         |");
        System.out.println("|_____________________________________________|");
        System.out.println("| Employee ID    : " + empId + "              |");
        System.out.println("| Employee Name  : " + empName + "            |");
        System.out.println("|_____________________________________________|");
        System.out.println("| Basic Salary   : " + basicSalary + "        |");
        System.out.println("| HRA 10%        : " + HRA + "                |");
        System.out.println("| TA 9%          : " + TA + "                 |");
        System.out.println("| DA 8%          : " + DA + "                 |");
        System.out.println("| PF 20%         : " + PF + "                 |");
        System.out.println("|_____________________________________________|");
        System.out.println("| Gross Salary   : " + grossSalary + "        |");
        System.out.println("|=============================================|");
    }
}
