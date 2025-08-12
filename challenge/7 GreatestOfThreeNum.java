import java.util.Scanner;

class GreatestOfThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest of the three number");

        System.out.print("Enter Your First Number: ");
        int Num1 = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int Num2 = input.nextInt();
        System.out.print("Enter Your Third Number: ");
        int Num3 = input.nextInt();

        if (Num1 >= Num2 && Num1 >= Num3) {
            System.out.println(Num1 + " :is Greatest Number.");
        } else if (Num2 >= Num3) {
            System.out.println(Num2 + " :is Greatest Number.");
        } else {
            System.out.println(Num3 + " :is Greatest Number.");
        }
    }
}
