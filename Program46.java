import java.util.Scanner;
class CGPAPercentageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of Subject: ");
        int numCourses = input.nextInt();

        double totalCGPA = 0.0;
        double totalCredits = 0.0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.printf("Enter CGPA for Subject %d: ", i);
            double cgpa = input.nextDouble();

            System.out.printf("Enter Credits for Subject %d: ", i);
            int credits = input.nextInt();

            totalCGPA += cgpa * credits;
            totalCredits += credits;
        }

        if (totalCredits == 0) {
            System.out.println("Error: Total credits cannot be zero.");
        } else {
            double cgpaPercentage = (totalCGPA / totalCredits) * 10;
            System.out.printf("CGPA Percentage: %.2f%%\n", cgpaPercentage);
        }
    }
}
