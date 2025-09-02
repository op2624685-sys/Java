import java.util.Scanner;

class ReverseThedigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to reverse the digits program \n");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int reverse = reverseDigits(num);
        System.out.println("Reverse of digits is :" + reverse);
    }

    public static int reverseDigits(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
