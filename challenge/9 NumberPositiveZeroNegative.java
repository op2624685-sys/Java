import java.util.Scanner;

class NumberPositiveZeroNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determine number is positive, negative or zero");

        System.out.print("Write the Number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your Number Is Positive: ");
        } else if (num == 0) {
            System.out.println("Your Number Is Zero: ");
        } else {
            System.out.println("Your Number Is Negative: ");

        }
    }

}
