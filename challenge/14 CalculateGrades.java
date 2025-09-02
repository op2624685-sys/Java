import java.util.Scanner;

class CalculateGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's know your grade:- ");
        System.out.print("Enter your percentage: ");
        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("Grade 'A' ");
        } else if (percentage >= 75) {
            System.out.println("Grade 'B' ");
        } else if (percentage >= 60) {
            System.out.println("Grade 'C' ");
        } else if (percentage >= 30) {
            System.out.println("Grade 'D' ");
        } else {
            System.out.println("'Fail'");
        }

    }
}