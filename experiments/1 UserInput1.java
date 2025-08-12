package experiments;

import java.util.Scanner;

class UserInput1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your First Number: ");
        int Num1 = input .nextInt();
        System.out.println("Please Enter Your Second Number: ");
        int Num2 = input .nextInt();
        int sum = Num1 + Num2;
        System.out.println( sum );

    }
}
