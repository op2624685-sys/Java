import java.util.Scanner;

class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Factorial Number :- ");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Your factorial number is: " + fact);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}