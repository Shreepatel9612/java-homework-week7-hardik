package homework7;

import java.util.Scanner;

/**
 *
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 *
 */

public class MarkSheet3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter roll number:");
        int rollNo = scanner.nextInt();

        // Input marks for 3 subjects
        System.out.print("Enter marks for math: ");
        int math = scanner.nextInt();
        if (math < 0 || math > 100){
            System.out.println("Invalid input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter marks for science: ");
        int science = scanner.nextInt();
        if (science < 0 || science > 100){
            System.out.println("Invalid input, Marks should be between o to 100");
            return;
        }

        System.out.println("Enter marks for english: ");
        int english = scanner.nextInt();
        if (english < 0 || english > 100 ){
            System.out.println("Invalid Input,Marks should be between 0 to 100");
            return;
        }


        // calculate total and percentage
        int total = math+science+english;
        double percentage = total / 3.0;

        //Determine result
        String result = (percentage >= 35) ? "Pass" : "Fail";

        //Determine grade
        String grade;
        if (percentage >= 80){
            grade = "A+";
        }else if (percentage >= 60){
            grade = "A";
        }else if (percentage >= 50 ){
            grade = "B";
        }else if (percentage >= 35){
            grade = "C";
        }else {
            grade = "None";
        }

        // Print mark sheet
        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|          Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.println("| Name     : " + name + "            |");
        System.out.println("| Roll No  : " + rollNo + "                 |");
        System.out.println("|_____________________________|");
        System.out.println("| Subjects     : Marks         |");
        System.out.println("|_____________________________|");
        System.out.println("| Math        : " + math + "              |");
        System.out.println("| Science     : " + science + "              |");
        System.out.println("| English     : " + english + "              |");
        System.out.println("|_____________________________|");
        System.out.println("| Total       : " + total + "             |");
        System.out.println("|_____________________________|");
        System.out.println("| Percentage  : " + percentage + "            |");
        System.out.println("| Result      : " + result + "           |");
        System.out.println("| Grade       : " + grade + "              |");
        System.out.println("|_____________________________|");
    }

}
