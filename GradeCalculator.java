public class GradeCalculator {
    // Method to calculate grade based on marks
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main method to test the GradeCalculator class
    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();
        
        // Example usage
        double marks = 85.5;
        String grade = gradeCalculator.calculateGrade(marks);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
