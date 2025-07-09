import java.util.*;
public class StudentGradeCalculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int physics_marks = sc.nextInt();
        int chemistry_marks = sc.nextInt();
        int maths_marks = sc.nextInt();
        int english_marks = sc.nextInt();
        int TotMarks = physics_marks+chemistry_marks+maths_marks+english_marks;
        int AvgPercentage = (TotMarks/4);
        System.out.println("The total marks are : " + TotMarks);
        System.out.println("The average percentage is : " + AvgPercentage);
        if(AvgPercentage >= 90) {
            System.out.print("Grade A");
        }
        else if(AvgPercentage >= 80) {
            System.out.print("Grade B");
        }
        else if(AvgPercentage >= 70) {
            System.out.print("Grade C");
        }
        else if(AvgPercentage >= 60) {
            System.out.print("Grade D");
        }
        else if(AvgPercentage >= 50) {
            System.out.print("Grade E");
        }
        else if(AvgPercentage <= 40) {
            System.out.print("Fail");
        }
        else{
            System.out.print("INVALID CHOICE ENTERED BY THE USER...");
        }
    }
}