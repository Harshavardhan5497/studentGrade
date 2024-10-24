import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects;
        double totalMarks = 0;

        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }
            totalMarks += marks[i];
        }

        
        double averagePercentage = (totalMarks / (numSubjects*100))*100;

        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}