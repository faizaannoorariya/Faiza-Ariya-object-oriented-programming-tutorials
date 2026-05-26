import java.util.Scanner;

public class StudentGrade {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        //Input
        System.out.println("Enter a student name:" ); 
        String name = input.nextLine();

        System.out.println("Enter the student ID: ");
        String ID = input.nextLine();

        System.out.println("Enter the coding marks: ");
        double codingmarks = input.nextDouble();

        //Grade info

        String grade;
        if (codingmarks >= 80) {
            grade = "PASS";
        }
        else {
            grade = "FAIL";

        }

        //Output
        System.out.println("\n===== Hello=====");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + ID);
        System.out.println("Coding grade is: " + grade);

        input.close();







    }
}