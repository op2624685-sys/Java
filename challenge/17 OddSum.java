import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Odd Sum of number");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int sum = printOddSum(num);
        System.out.println("Sum of the Odd number: " + sum);
    }

    public static int printOddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
