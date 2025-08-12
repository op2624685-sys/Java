import java.util.Scanner;

class NumberOddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your Number is Odd or Even");
        System.out.print("Enter Your Number: ");
        int Num = input .nextInt();

        if (Num % 2 == 0) {
            System.out.println("Your Number Is An Even Number" + Num);
        } else {
            System.out.println("Your Number Is An Odd Number: " + Num);
        }
    }
}
