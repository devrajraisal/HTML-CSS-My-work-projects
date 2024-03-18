import java.util.Scanner;

public class intenT2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int totalSubjects;
            int totalMarks = 0;
            double averagePercentage;
            String grade;

            System.out.print("Enter the total number of subjects: ");
            totalSubjects = input.nextInt();

            for (int i = 1; i <= totalSubjects; i++) {
                System.out.print("Enter marks obtained in subject " + i + ": ");
                totalMarks += input.nextInt();
            }

            averagePercentage = (double) totalMarks / totalSubjects;

            if (averagePercentage >= 90) {
                grade = "A+";
            } else if (averagePercentage >= 80) {
                grade = "A";
            } else if (averagePercentage >= 70) {
                grade = "B";
            } else if (averagePercentage >= 60) {
                grade = "C";
            } else if (averagePercentage >= 50) {
                grade = "D";
            } else {
                grade = "Fail";
            }

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
        }
}
