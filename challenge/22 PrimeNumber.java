import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime number checker\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        boolean isprime = isPrimeNumber(num);
        if (isprime) {
            System.out.println("Your number is prime number ");
        } else {
            System.out.println("Your number is not prime number ");
        }
    }

    public static boolean isPrimeNumber(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
